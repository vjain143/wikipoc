/**
 * AccountServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wiki.poc.AccountSchema;

import java.rmi.RemoteException;

import com.wiki.poc.service.AccountService;

public class AccountServiceSOAPImpl implements AccountService_PortType 
{
	public AccountInsertResponse accountInsert(AccountInsertRequest accountInsertRequest)throws RemoteException 
	{
		AccountService service = new AccountService();
		return service.insert(accountInsertRequest);		
	}

	public AccountSelectResponse accountSelect( AccountSelectRequest accountSelectRequest)throws RemoteException 
	{
		AccountService service = new AccountService();
		return service.select(accountSelectRequest);
	}

}

