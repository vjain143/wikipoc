package com.wiki.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author NLJAJV
 *
 */
@XmlRootElement(name="accountsdata")
public class AccountsDTO {
	private int count;
		
	private List<AccountDTO> accountdatalist;
	
	public AccountsDTO() {}
	
	public AccountsDTO(List<AccountDTO> accountdatalist) 
	{
		this.accountdatalist = accountdatalist;
		this.count = accountdatalist.size();
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@XmlElement(name="accountdata")
	public List<AccountDTO> getAccountdatalist() {
		return accountdatalist;
	}

	public void setAccountdatalist(List<AccountDTO> accountdatalist) {
		this.accountdatalist = accountdatalist;
	}	
}