package com.wiki.poc.domain;
import java.io.Serializable;
public class AccountDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String organization;

	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getOrganization() 
	{
		return organization;
	}
	public void setOrganization(String organization) 
	{
		this.organization = organization;
	}
}



