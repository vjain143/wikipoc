package com.wiki.poc.ws.endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.wiki.poc.accountSchema.AccountInsertRequestDocument;
import com.wiki.poc.accountSchema.AccountInsertRequestType;
import com.wiki.poc.accountSchema.AccountInsertResponseDocument;
import com.wiki.poc.accountSchema.AccountSelectRequestDocument;
import com.wiki.poc.accountSchema.AccountSelectResponseDocument;
import com.wiki.poc.accountSchema.AccountSelectResponseType;
import com.wiki.poc.repository.AccountRepository;
import com.wiki.poc.shared.dto.AccountDTO;
/**
 * 
 * @author nljajv
 *
 */
@Endpoint
public class AccountServiceEndpoint
{
	@Autowired
	private AccountRepository repository;
	
	/**
	 * 
	 * @param request
	 * @return
	 */
    @PayloadRoot( localPart = "AccountSelectRequest" , namespace = "http://poc.wiki.com/AccountSchema" )
    public AccountSelectResponseDocument select( final AccountSelectRequestDocument request )throws Throwable
    {
        AccountSelectResponseDocument responseDocument = AccountSelectResponseDocument.Factory.newInstance();       
        try        
        {
        	 String accountId = request.getAccountSelectRequest().getId();
        	 AccountDTO accountDTO = this.repository.select(accountId);
        	 AccountSelectResponseType responseType = responseDocument.addNewAccountSelectResponse();
             responseType.setId( accountDTO.getAccNumber() );
             responseType.setName( accountDTO.getAccHolderName() );
             responseType.setOrganization( accountDTO.getAccHolderOrg() );
        }
        catch( Throwable throwable )
        {
        	throwable.printStackTrace();
        }       
        return responseDocument;
    }
    
    /**
     * 
     * @param request
     * @return
     * @throws Throwable
     */
    @PayloadRoot( localPart = "AccountInsertRequest" , namespace = "http://poc.wiki.com/AccountSchema" )
    public AccountInsertResponseDocument insert( final AccountInsertRequestDocument request )throws Throwable
    {
    	AccountDTO accountDTO = new AccountDTO();
    	
    	AccountInsertRequestType requestType = request.getAccountInsertRequest();
    	accountDTO.setAccNumber( requestType.getId() );
    	accountDTO.setAccHolderName( requestType.getName() );
    	accountDTO.setAccHolderOrg( requestType.getOrganization() );
    	this.repository.insert(accountDTO);
    	
        AccountInsertResponseDocument responseDocument = AccountInsertResponseDocument.Factory.newInstance();        
        responseDocument.addNewAccountInsertResponse().setStatus( "Inserted" );
        return responseDocument;
    }
    
    /**
     * 
     * @param repository
     */
    public void setRepository(AccountRepository repository)
	{
		this.repository = repository;
	}
    
}