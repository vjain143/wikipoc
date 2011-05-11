package com.wiki.poc.ws.endpoint;

import net.javacrumbs.smock.springws.server.AbstractSmockServerTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
/**
 * 
 * @author nljajv
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/test/resources/context/account-ws-servlet.xml"})
public class AccountServiceEndpointTest extends AbstractSmockServerTest
{
	private MockWebServiceClient client;
	
	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext)
	{
		client = createClient(applicationContext, null);
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAccountInsertRequest() throws Exception 
	{
		client.sendRequest(withMessage("AccountInsertRequest01.xml")).andExpect(message("AccountInsertResponse01.xml"));		
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAccountSelectRequest() throws Exception 
	{
		client.sendRequest(withMessage("AccountSelectRequest01.xml")).andExpect(message("AccountSelectResponse01.xml"));
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAccountInsert2Request() throws Exception 
	{
		client.sendRequest(withMessage("AccountInsertRequest02.xml")).andExpect(message("AccountInsertResponse02.xml"));		
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAccountSelect2Request() throws Exception 
	{
		client.sendRequest(withMessage("AccountSelectRequest02.xml")).andExpect(message("AccountSelectResponse02.xml"));
	}
}
