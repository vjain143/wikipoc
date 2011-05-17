package com.wiki.poc.shared.dto;
/**
 * 
 * @author nljajv
 *
 */
public class AccountDTO 
{
	private String accNumber;
	private String accHolderName;
	private String accHolderOrg;

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccHolderOrg() {
		return accHolderOrg;
	}

	public void setAccHolderOrg(String accHolderOrg) {
		this.accHolderOrg = accHolderOrg;
	}

}