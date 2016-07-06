package com.vini.oba.service;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.vini.oba.dao.CustomerDAO;
import com.vini.oba.dto.AccountDTO;
import com.vini.oba.dto.CustomerDTO;
public class CustomerService
{
	private CustomerDAO customerDAO = new CustomerDAO();
	CustomerDTO customerObject = new CustomerDTO();
	public void insertCustomerData(String commaSeparated)
	{
		List<String> items = Arrays.asList(commaSeparated.split(","));
		customerObject.setCustomerId(items.get(0));
		customerObject.setFirstName(items.get(1));
		customerObject.setLastName(items.get(2));
		AccountDTO accountObject = new AccountDTO();
		accountObject.setAccountId(items.get(3));
		accountObject.setAccountNo(items.get(4));
		accountObject.setSortCode(items.get(5));
		customerObject.setAccountDTO(accountObject);
		customerDAO.insertCustomerData(customerObject);
		// return isInserted;
	}
	public void updateCustomerData(String commaSeparated)
	{
		boolean isUpdated = false;
		List<String> items = Arrays.asList(commaSeparated.split(","));
		System.out.println(items.get(0));
		customerObject.setCustomerId(items.get(0));
		customerObject.setFirstName(items.get(1));
		customerObject.setLastName(items.get(2));
		AccountDTO accountObject = new AccountDTO();
		accountObject.setAccountId(items.get(3));
		accountObject.setAccountNo(items.get(4));
		accountObject.setSortCode(items.get(5));
		customerObject.setAccountDTO(accountObject);
		customerDAO.updateCustomerData(customerObject);
	}
	public void deleteCustomerData(String customerId)
	{
		customerDAO.deleteCustomerData(customerId);
	}
	public CustomerDTO selectCustomerData(String customerId)
	{
		CustomerDTO custOb = customerDAO.selectCustomerData(customerId);
		return custOb;
	}
	// Not required anymore for this implementation
	public Map selectAllCustomerData()
	{
		return CustomerDAO.customerMap;
	}
	public String selectAccountID(String custID)
	{
		String accID;
		Map tempCust = this.selectAllCustomerData();
		if (tempCust.containsKey(custID))
		{
			CustomerDTO tempObj = (CustomerDTO) tempCust.get(custID);
			AccountDTO tempAccountObj = tempObj.getAccountDTO();
			accID = tempAccountObj.getAccountId();
		}
		else
		{
			accID = null;
		}
		return accID;
	}
}
