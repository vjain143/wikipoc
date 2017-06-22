package com.vini.oba.dto;
public class CustomerDTO
{
	private String customerId;
	private String firstName;
	private String lastName;
	private AccountDTO accountDTO;
	/**
	 * @return the accountDTO
	 */
	public AccountDTO getAccountDTO()
	{
		return accountDTO;
	}
	/**
	 * @param accountDTO
	 *            the accountDTO to set
	 */
	public void setAccountDTO(AccountDTO accountDTO)
	{
		this.accountDTO = accountDTO;
	}
	public String getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}
	public void setFirstName(String name1)
	{
		firstName = name1;
	}
	public void setLastName(String name2)
	{
		lastName = name2;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
}
