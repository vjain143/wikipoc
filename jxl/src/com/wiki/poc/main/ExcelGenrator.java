package com.wiki.poc.main;

import java.util.ArrayList;
import java.util.List;

import com.wiki.poc.dto.AccountDTO;
import com.wiki.poc.util.JXLUtil;

public class ExcelGenrator
{
	public static void main(String[] args)
	{
		ExcelGenrator excelGenrator = new ExcelGenrator();
		List accountDTOList = excelGenrator.prepareDummydata();
		JXLUtil.writeExcel(accountDTOList, "dummy.xls");
	}
	
	private List prepareDummydata()
	{
		List accountDTOList = new ArrayList();
		
		AccountDTO accountDTO1 = new AccountDTO();
		accountDTO1.setAccountNumber("000123456");
		accountDTO1.setAccountHolderName("Peter Hook");
		accountDTO1.setAccountCurrency("YEN");
		accountDTO1.setAccountHolderAddress("Part Street");
		accountDTO1.setAccountHolderContactNo("012-45624521");
		accountDTOList.add(accountDTO1);
		
		AccountDTO accountDTO2 = new AccountDTO();
		accountDTO2.setAccountNumber("000234098");
		accountDTO2.setAccountHolderName("John Hook");
		accountDTO2.setAccountCurrency("USD");
		accountDTO2.setAccountHolderAddress("E Street");
		accountDTO2.setAccountHolderContactNo("012-80624521");
		accountDTOList.add(accountDTO2);
		
		AccountDTO accountDTO3 = new AccountDTO();
		accountDTO3.setAccountNumber("000654123");
		accountDTO3.setAccountHolderName("BAS Hook");
		accountDTO3.setAccountCurrency("EUR");
		accountDTO3.setAccountHolderAddress("Street NL");
		accountDTO3.setAccountHolderContactNo("043-45611121");
		accountDTOList.add(accountDTO3);
		
		return accountDTOList;
	}
	
}
