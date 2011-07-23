package com.wiki.client;
/**
 * HTTP method	RestTemplate methods
 * DELETE	delete(java.lang.String, java.lang.Object...)
 * GET	getForObject(java.lang.String, java.lang.Class, java.lang.Object...)
 * getForEntity(java.lang.String, java.lang.Class, java.lang.Object...)
 * HEAD	headForHeaders(java.lang.String, java.lang.Object...)
 * OPTIONS	optionsForAllow(java.lang.String, java.lang.Object...)
 * POST	postForLocation(java.lang.String, java.lang.Object, java.lang.Object...)
 * 		postForObject(java.lang.String, java.lang.Object, java.lang.Class, java.lang.Object...)
 * PUT	put(java.lang.String, java.lang.Object, java.lang.Object...)
 * any	exchange(java.lang.String, org.springframework.http.HttpMethod, org.springframework.http.HttpEntity, java.lang.Class, java.lang.Object...)
 * execute(java.lang.String, org.springframework.http.HttpMethod, org.springframework.web.client.RequestCallback, org.springframework.web.client.ResponseExtractor, java.lang.Object...)
 * 
 */
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wiki.dto.AccountDTO;
import com.wiki.dto.AccountsDTO;
import com.wiki.service.AccountDataService;
/**
 * 
 * @author NLJAJV
 *
 */
public class AccountServiceJSONClient 
{	
	private static final Logger LOG = Logger.getLogger(AccountDataService.class);	
	private static final String ACCOUNT_SERVICE_URI= "http://localhost:8080/spring-rest-ws/service/";
	//private static final String ACCOUNT_SERVICE_URI= "http://asde02011.nl.eu.abnamro.com:9083/AccountService/service/";
	private static HttpEntity<String> HTTP_ENTITY_JSON;
	
	/**
	 * TODO
	 * @param args
	 */
	public static void main(String[] args) 
	{		
		RestTemplate restTemplate = getTemplate();
		prepareHttpEntity();		
		
		//CURD Operations		
		insertAccountData(restTemplate);
		//updateAccountData(restTemplate);
		//deleteAccountData(restTemplate);
		
		//selectAccountData(restTemplate);
		selectAllAccountData(restTemplate);		
	}
	
	/**
	 * 
	 * @param restTemplate
	 */
	private static void insertAccountData(RestTemplate restTemplate)
	{
		String requestUrl = ACCOUNT_SERVICE_URI+"insertaccountdata";
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountId("00001003");
		accountDTO.setAccountHolderName("Sandeep");
		accountDTO.setAccountContactNo("02023456789");
		accountDTO.setCurrency("INR");
		accountDTO.setAccountEmail("sandeep@gmail.com");
		accountDTO.setAccountDOB("12-12-1979");
		
		restTemplate.postForObject(requestUrl, accountDTO, AccountDTO.class);
		
		//Now verify data set with new value
		selectAllAccountData(restTemplate);
	}
	
	/**
	 * 
	 * @param restTemplate
	 */
	private static void updateAccountData(RestTemplate restTemplate)
	{
		String requestUrl = ACCOUNT_SERVICE_URI+"updateaccountdata";
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountHolderName("Rohan");
		accountDTO.setAccountId("00001002");
		accountDTO.setAccountContactNo("02023456000");
		accountDTO.setCurrency("INR");
		accountDTO.setAccountEmail("rohan_1@gmail.com");
		accountDTO.setAccountDOB("12-12-1980");		
		
		restTemplate.put(requestUrl, accountDTO );
		
		//Now verify data set with new value
		selectAllAccountData(restTemplate);
		
	}
	
	/**
	 * 
	 * @param restTemplate
	 */
	private static void deleteAccountData(RestTemplate restTemplate)
	{
		String requestUrl = ACCOUNT_SERVICE_URI+"deleteaccountdata/00001003";
		
		restTemplate.delete(requestUrl);		
		
		//Now verify data set with new value
		selectAllAccountData(restTemplate);		
	}


	/**
	 * 
	 * @param restTemplate
	 */
	private static void selectAccountData( RestTemplate restTemplate )
	{				
		String requestUrl = ACCOUNT_SERVICE_URI+"accountdata/00001002";
		ResponseEntity<AccountDTO> responseEntity =  restTemplate.exchange( requestUrl, HttpMethod.GET, HTTP_ENTITY_JSON, AccountDTO.class );
		AccountDTO accountDTO = responseEntity.getBody();
		LOG.info("Select Account Data ---------------------------------------------");
		LOG.info( "Account Holder Name : " + accountDTO.getAccountHolderName() );
		LOG.info( "Account Id          : " + accountDTO.getAccountId() );
		LOG.info( "Currency            : " + accountDTO.getCurrency() );
		LOG.info( "Date of Birth       : " + accountDTO.getAccountDOB() );			
		LOG.info( "Contact No          : " + accountDTO.getAccountContactNo() );
		LOG.info( "Email               : " + accountDTO.getAccountEmail() );
	}
	
	/**
	 * TODO
	 * @param restTemplate
	 */
	private static void selectAllAccountData( RestTemplate restTemplate )
	{				
		String requestUrl = ACCOUNT_SERVICE_URI+"accountdatalist";
		ResponseEntity<AccountsDTO> responseEntity =  restTemplate.exchange( requestUrl, HttpMethod.GET, HTTP_ENTITY_JSON, AccountsDTO.class );
		AccountsDTO accountsDTO = responseEntity.getBody();
		for ( AccountDTO accountDTO : accountsDTO.getAccountdatalist() )
		{
			LOG.info("Select All Account Data --------------------------------------");
			LOG.info( "Account Holder Name : " + accountDTO.getAccountHolderName() );
			LOG.info( "Account Id          : " + accountDTO.getAccountId() );
			LOG.info( "Currency            : " + accountDTO.getCurrency() );
			LOG.info( "Date of Birth       : " + accountDTO.getAccountDOB() );			
			LOG.info( "Contact No          : " + accountDTO.getAccountContactNo() );
			LOG.info( "Email               : " + accountDTO.getAccountEmail() );
		}
	}	
	
	/**
	 * TODO
	 * @return RestTemplate
	 */
	private static RestTemplate getTemplate()
	{
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(  new String[]{ "WebContent/WEB-INF/rest-servlet.xml", "WebContent/WEB-INF/rest-context.xml" } );
		RestTemplate restTemplate = ( RestTemplate ) applicationContext.getBean( "restTemplate" );
		return restTemplate;
	}
	
	/**
	 * TODO
	 */
	private static void prepareHttpEntity()
	{
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType( MediaType.APPLICATION_JSON );
		HTTP_ENTITY_JSON = new HttpEntity<String>( httpHeaders );
	}	
}