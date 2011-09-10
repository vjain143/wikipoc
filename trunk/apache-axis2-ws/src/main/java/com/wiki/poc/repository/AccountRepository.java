package com.wiki.poc.repository;

import java.util.LinkedHashMap;
import java.util.Map;
import com.wiki.poc.domain.AccountDTO;
public class AccountRepository 
{
	public static Map <String,AccountDTO> accountMap = new LinkedHashMap <String,AccountDTO>();
	
	static 
	{
		AccountDTO accountDTO1 = new AccountDTO();
		accountDTO1.setId("1001");
		accountDTO1.setName("Vivek Jain");
		accountDTO1.setOrganization("WIKI");
		accountMap.put("1001", accountDTO1);
	}

	public void insert(AccountDTO accountDTO1) 
	{
		accountMap.put(accountDTO1.getId(), accountDTO1);
	}

	public AccountDTO select( String id )
	{
		return accountMap.get(id);
	}	
}

