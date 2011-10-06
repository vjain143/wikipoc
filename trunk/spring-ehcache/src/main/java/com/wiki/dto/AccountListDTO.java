package com.wiki.dto;

import java.util.List;

public class AccountListDTO
{
    private int              count;

    private List<AccountDTO> accountdatalist;

    public AccountListDTO()
    {
    }

    public AccountListDTO( List<AccountDTO> accountdatalist )
    {
        this.accountdatalist = accountdatalist;
        this.count = accountdatalist.size();
    }

    public int getCount()
    {
        return count;
    }

    public void setCount( int count )
    {
        this.count = count;
    }

    public List<AccountDTO> getAccountdatalist()
    {
        return accountdatalist;
    }

    public void setAccountdatalist( List<AccountDTO> accountdatalist )
    {
        this.accountdatalist = accountdatalist;
    }
}