package com.wiki.poc.dto;

public class AccountDTO
{
	private String accountNumber;
	private String accountHolderName;
	private String accountCurrency;
	private String accountHolderAddress;
	private String accountHolderContactNo;
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public String getAccountCurrency()
	{
		return accountCurrency;
	}
	public void setAccountCurrency(String accountCurrency)
	{
		this.accountCurrency = accountCurrency;
	}
	public String getAccountHolderAddress()
	{
		return accountHolderAddress;
	}
	public void setAccountHolderAddress(String accountHolderAddress)
	{
		this.accountHolderAddress = accountHolderAddress;
	}
	public String getAccountHolderContactNo()
	{
		return accountHolderContactNo;
	}
	public void setAccountHolderContactNo(String accountHolderContactNo)
	{
		this.accountHolderContactNo = accountHolderContactNo;
	}
}