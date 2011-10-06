package com.wiki.dto;

public class AccountDTO
{
    private String accountId;
    private String accountHolderName;
    private String accountEmail;
    private String accountContactNo;
    private String accountDOB;
    private String currency;

    public AccountDTO()
    {

    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId( String accountId )
    {
        this.accountId = accountId;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void setAccountHolderName( String accountHolderName )
    {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountEmail()
    {
        return accountEmail;
    }

    public void setAccountEmail( String accountEmail )
    {
        this.accountEmail = accountEmail;
    }

    public String getAccountContactNo()
    {
        return accountContactNo;
    }

    public void setAccountContactNo( String accountContactNo )
    {
        this.accountContactNo = accountContactNo;
    }

    public String getAccountDOB()
    {
        return accountDOB;
    }

    public void setAccountDOB( String accountDOB )
    {
        this.accountDOB = accountDOB;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String currency )
    {
        this.currency = currency;
    }
}