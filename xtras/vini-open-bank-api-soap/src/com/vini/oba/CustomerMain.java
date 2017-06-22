package com.vini.oba;
import java.util.Scanner;

import com.vini.oba.service.CustomerService;
public class CustomerMain
{
	
	public static void main(String[] args)
	{
		CustomerService customerServiceObject = new CustomerService();
		
			System.out.println("Please select options 1=Select, 2=Insert");
			Scanner scanner = new Scanner(System.in);
			String customerId = scanner.next();
				
				//customerServiceObject.insertCustomerData(customerId);
				//String customerInput = scanner.next();
				//customerServiceObject.updateCustomerData(customerId);
				
			//String customerId1 = scanner.next();
				customerServiceObject.deleteCustomerData(customerId);
				//System.out.print(customerServiceObject.selectCustomerData(customerId).getFirstName());
				scanner.close();
		
	}
}
