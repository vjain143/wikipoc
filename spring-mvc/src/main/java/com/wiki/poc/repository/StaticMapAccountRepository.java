package com.wiki.poc.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wiki.poc.dto.Account;

public class StaticMapAccountRepository implements AccountRepository
{
    static Map<String, Account> accounts = new HashMap<String, Account>();

    static
    {
        accounts.put( "1", new Account( "1", "Jay Khimani", "CTS" ) );
        accounts.put( "2", new Account( "2", "Suraj Raibagkar", "CTS" ) );
        accounts.put( "3", new Account( "3", "Chaitanya Jadhav", "CTS" ) );
        accounts.put( "4", new Account( "4", "Vivek Jain", "CTS" ) );
    }

    public Account select( String number )
    {
        return accounts.get( number );
    }

    public void insert( Account account )
    {
        accounts.put( account.getNumber(), account );
    }

    public void update( Account account )
    {
        // TODO Auto-generated method stub	
        accounts.put( account.getNumber(), account );
    }

    public void delete( String number )
    {
        // TODO Auto-generated method stub
        accounts.remove( number );
    }

    public void upload()
    {
        // TODO Auto-generated method stub		
    }

    public Map<String, Account> selectAll()
    {
        return this.accounts;
    }
}