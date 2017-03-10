package com.wiki.poc.dto;

public class Account
{
    private String number;
    private String name;
    private String organization;

    public Account( String number, String name, String organization )
    {
        this.number = number;
        this.name = name;
        this.organization = organization;
    }

    public Account()
    {
    }

    public String getNumber()
    {
        return number;
    }

    public String getName()
    {
        return name;
    }

    public String getOrganization()
    {
        return organization;
    }

    public void setNumber( String number )
    {
        this.number = number;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public void setOrganization( String organization )
    {
        this.organization = organization;
    }
}