package com.wiki.poc.service;
import com.wiki.poc.AccountSchema.AccountInsertRequest;
import com.wiki.poc.AccountSchema.AccountInsertResponse;
import com.wiki.poc.AccountSchema.AccountSelectRequest;
import com.wiki.poc.AccountSchema.AccountSelectResponse;
import com.wiki.poc.domain.AccountDTO;
import com.wiki.poc.repository.AccountRepository;
public class AccountService 
{
	private AccountRepository repository;
	
	public AccountService()
	{
		repository = new AccountRepository();
	}
	
	public AccountInsertResponse insert(AccountInsertRequest request)
	{
		AccountInsertResponse response = new AccountInsertResponse();
		try
		{
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setId( request.getId() );
			accountDTO.setName( request.getName() );
			accountDTO.setOrganization( request.getOrganization() );
			this.repository.insert(accountDTO);
			response.setStatus("Success");
		}
		catch(Throwable throwable)
		{
			throwable.printStackTrace();
			response.setStatus("Fail");
		}		
		return response;
	}
	
	public AccountSelectResponse select( AccountSelectRequest request)
	{
		AccountSelectResponse response = new AccountSelectResponse();		
		AccountDTO accountDTO = this.repository.select( request.getId() );
		response.setId(accountDTO.getId());
		response.setName(accountDTO.getName());
		response.setOrganization(accountDTO.getOrganization());		
		return response;
	}	
}