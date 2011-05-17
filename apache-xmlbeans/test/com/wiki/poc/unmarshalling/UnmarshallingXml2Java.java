package com.wiki.poc.unmarshalling;

import com.wiki.poc.accountSchema.AccountInsertRequestDocument;
import com.wiki.poc.accountSchema.AccountInsertRequestType;
import com.wiki.poc.accountSchema.AccountInsertResponseDocument;
import com.wiki.poc.accountSchema.AccountInsertResponseType;
import com.wiki.poc.accountSchema.AccountSelectRequestDocument;
import com.wiki.poc.accountSchema.AccountSelectRequestType;
import com.wiki.poc.accountSchema.AccountSelectResponseDocument;
import com.wiki.poc.accountSchema.AccountSelectResponseType;

public class UnmarshallingXml2Java 
{
	public static void main(String[] args) 
	{
		UnmarshallingXml2Java.showAccountInsertRequest();
		UnmarshallingXml2Java.showAccountInsertResponse();
		
		UnmarshallingXml2Java.showAccountSelectRequest();
		UnmarshallingXml2Java.showAccountSelectResponse();
	}
	
	public static void showAccountInsertRequest()
	{
		AccountInsertRequestDocument request = AccountInsertRequestDocument.Factory.newInstance();
		AccountInsertRequestType requestType = request.addNewAccountInsertRequest();
		requestType.setId("2");
		requestType.setName("Vivek Jain");
		requestType.setOrganization("CTS");		
		System.out.println( request.xmlText() );
	}
	
	public static void showAccountInsertResponse()
	{
		AccountInsertResponseDocument response = AccountInsertResponseDocument.Factory.newInstance();
		AccountInsertResponseType responseType = response.addNewAccountInsertResponse();
		responseType.setStatus("Success");
		System.out.println( response.xmlText() );
	}
	
	public static void showAccountSelectRequest()
	{
		AccountSelectRequestDocument request = AccountSelectRequestDocument.Factory.newInstance();
		AccountSelectRequestType requestType = request.addNewAccountSelectRequest();	
		requestType.setId("2");		
		System.out.println( request.xmlText() );
	}
	
	public static void showAccountSelectResponse()
	{
		AccountSelectResponseDocument request = AccountSelectResponseDocument.Factory.newInstance();
		AccountSelectResponseType requestType = request.addNewAccountSelectResponse();		
		requestType.setId("2");		
		requestType.setName("Vivek Jain");
		requestType.setOrganization("CTS");
		System.out.println( request.xmlText() );
	}
	
}
