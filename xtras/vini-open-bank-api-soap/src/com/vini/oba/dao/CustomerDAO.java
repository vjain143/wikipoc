package com.vini.oba.dao;
import java.util.HashMap;
import java.util.Map;

import com.vini.oba.dto.AccountDTO;
import com.vini.oba.dto.CustomerDTO;
public class CustomerDAO
{
	public static HashMap<String, CustomerDTO> customerMap = new HashMap<String, CustomerDTO>();
	public CustomerDTO selectCustomerData(String customerId)
	{
		DataHandler datahandler = new DataHandler();
		CustomerDTO customerObject = datahandler.selectData(customerId);
		
		/*String str1 = customerObject.getCustomerId();
		String str2 = customerObject.getFirstName();
		String str3 = customerObject.getLastName();
		AccountDTO accObj = customerObject.getAccountDTO();
		String str4 = accObj.getAccountId();
		String str5 = accObj.getAccountNo();
		String str6 = accObj.getSortCode();
		String selectedData = str1+","+str2+","+str3+","+str4+","+str5+","+str6;
		*/
		
		return customerObject;
	}
	public void insertCustomerData(CustomerDTO customerObject)
	{
		//customerMap.put(customerObject.getCustomerId(), customerObject);
		//boolean isDataInserted = customerMap.containsKey(customerObject.getCustomerId());
		String str1 = customerObject.getCustomerId();
		String str2 = customerObject.getFirstName();
		String str3 = customerObject.getLastName();
		AccountDTO accObj = customerObject.getAccountDTO();
		String str4 = accObj.getAccountId();
		String str5 = accObj.getAccountNo();
		String str6 = accObj.getSortCode();
		
		String commaSeparated = str1+","+str2+","+str3+","+str4+","+str5+","+str6;
		DataHandler datahandler = new DataHandler();
		datahandler.insertData(commaSeparated);
		//return isDataInserted;
	}
	public void updateCustomerData(CustomerDTO customerObject)
	{
		
		String str1 = customerObject.getCustomerId();
		String str2 = customerObject.getFirstName();
		String str3 = customerObject.getLastName();
		AccountDTO accObj = customerObject.getAccountDTO();
		String str4 = accObj.getAccountId();
		String str5 = accObj.getAccountNo();
		String str6 = accObj.getSortCode();
		
		String commaSeparated = str1+","+str2+","+str3+","+str4+","+str5+","+str6;
		DataHandler datahandler = new DataHandler();
		datahandler.updateData(commaSeparated);
		
	}
	public void deleteCustomerData(String customerId)
	{
		DataHandler datahandler = new DataHandler();
		datahandler.deleteData(customerId);
	}
	public Map getStaticData()
	{
		CustomerDTO customerObj1 = new CustomerDTO();
		customerObj1.setCustomerId("234");
		customerObj1.setFirstName("Vivek");
		customerObj1.setLastName("Jain");
		AccountDTO accountObj1 = new AccountDTO();
		accountObj1.setAccountId("123");
		accountObj1.setAccountNo("90");
		accountObj1.setSortCode("110");
		customerObj1.setAccountDTO(accountObj1);
		customerMap.put(customerObj1.getCustomerId(), customerObj1);
		CustomerDTO customerObj2 = new CustomerDTO();
		customerObj2.setCustomerId("0001");
		customerObj2.setFirstName("Nidhi");
		customerObj2.setLastName("Jain");
		AccountDTO accountObj2 = new AccountDTO();
		accountObj2.setAccountId("010");
		accountObj2.setAccountNo("015");
		accountObj2.setSortCode("554");
		customerObj2.setAccountDTO(accountObj2);
		customerMap.put(customerObj2.getCustomerId(), customerObj2);
		return customerMap;
	}
}
