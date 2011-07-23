package com.wiki.controller.endpoint;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wiki.dto.AccountDTO;
import com.wiki.dto.AccountsDTO;
import com.wiki.service.AccountDataService;
/**
 * 
 * @author NLJAJV
 *
 */
@Controller
public class AccountServiceJSONEndpointController 
{	
	private AccountDataService accountDataService;	
	
	/**
	 * TODO
	 * @param accountDTO
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/insertaccountdata", headers="Accept=application/json,application/xml")
	public @ResponseBody AccountDTO insertAccountData(@RequestBody AccountDTO accountDTO) 
	{
		accountDataService.insertAccountData(accountDTO);
		return accountDTO;
	}
	
	/**
	 * TODO
	 * @param accountDTO
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT, value="/updateaccountdata", headers="Accept=application/json,application/xml")
	public @ResponseBody AccountDTO updateAccountData(@RequestBody AccountDTO accountDTO) 
	{
		accountDataService.updateAccountData(accountDTO);
		return accountDTO;
	}
	
	/**
	 * TODO
	 * @param accountId
	 */
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteaccountdata/{accountId}", headers="Accept=application/json,application/xml")
	public @ResponseBody void deleteAccountData(@PathVariable String accountId) 
	{
		accountDataService.deleteAccountData( accountId );
	}
	
	/**
	 * TODO
	 * @param accountId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/accountdata/{accountId}", headers="Accept=application/json,application/xml")
	public @ResponseBody AccountDTO selectAccountData(@PathVariable String accountId) 
	{
		AccountDTO accountDTO = accountDataService.selectAccountData( accountId );
		return accountDTO;
	}	
	
	/**
	 * TODO
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/accountdatalist", headers="Accept=application/json,application/xml")
	public @ResponseBody AccountsDTO selectAllAccountData() 
	{
		List <AccountDTO> accountList = accountDataService.selectAllAccountData();
		AccountsDTO accountsDTO = new AccountsDTO( accountList );		
		return accountsDTO;
	}

	public AccountDataService getAccountDataService() 
	{
		return accountDataService;
	}

	public void setAccountDataService(AccountDataService accountDataService) 
	{
		this.accountDataService = accountDataService;
	}
	
}