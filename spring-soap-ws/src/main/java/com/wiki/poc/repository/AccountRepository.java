package com.wiki.poc.repository;

import com.wiki.poc.shared.dto.AccountDTO;
/**
 * 
 * @author nljajv
 *
 */
public interface AccountRepository 
{
	/**
	 * 
	 * @param number
	 * @return
	 */
	public AccountDTO select(String number);
	
	/**
	 * 
	 * @param account
	 */
	public void insert(AccountDTO account);
	
	/**
	 * 
	 * @param account
	 */
	public void update(AccountDTO account);
	
	/**
	 * 
	 * @param number
	 */
	public void delete(String number);
	
	/**
	 * 
	 */
	public void upload();
}