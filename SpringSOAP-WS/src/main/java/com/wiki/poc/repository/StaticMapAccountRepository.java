package com.wiki.poc.repository;

import java.util.HashMap;
import java.util.Map;

import com.wiki.poc.shared.dto.AccountDTO;
/**
 * 
 * @author nljajv
 *
 */
public class StaticMapAccountRepository implements AccountRepository
{
	/**
	 * 
	 */
	static Map<String, AccountDTO> accounts = new HashMap<String, AccountDTO>();

	static
	{
		AccountDTO accountDTO1 = new AccountDTO();
		accountDTO1.setAccNumber("1");
		accountDTO1.setAccHolderName("Jay");
		accountDTO1.setAccHolderOrg("XYZ");
		
		AccountDTO accountDTO2 = new AccountDTO();
		accountDTO2.setAccNumber("2");
		accountDTO2.setAccHolderName("Suraj");
		accountDTO2.setAccHolderOrg("XYZ");
		
		AccountDTO accountDTO3 = new AccountDTO();
		accountDTO3.setAccNumber("3");
		accountDTO3.setAccHolderName("CJ");
		accountDTO3.setAccHolderOrg("XYZ");
		
		AccountDTO accountDTO4 = new AccountDTO();
		accountDTO4.setAccNumber("4");
		accountDTO4.setAccHolderName("VJ");
		accountDTO4.setAccHolderOrg("XYZ");
		
		accounts.put( accountDTO1.getAccNumber() , accountDTO1 );
		accounts.put( accountDTO2.getAccNumber() , accountDTO2 );
		accounts.put( accountDTO3.getAccNumber() , accountDTO3 );
		accounts.put( accountDTO4.getAccNumber() , accountDTO4 );
	}
		
	public AccountDTO select(String number)
	{
		return accounts.get(number);
	}

	public void insert(AccountDTO account)
	{
		accounts.put(account.getAccNumber(), account);
	}

	public void update(AccountDTO account)
	{
		accounts.put(account.getAccNumber(), account);
	}

	public void delete(String number)
	{
		accounts.remove(number);
	}

	public void upload()
	{
		
	}	
}