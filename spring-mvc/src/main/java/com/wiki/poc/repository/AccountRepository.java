package com.wiki.poc.repository;

import java.util.List;
import java.util.Map;

import com.wiki.poc.dto.Account;

public interface AccountRepository
{
    /**
     * @param number
     * @return
     */
    public Account select( String number );

    /**
     * @param account
     */
    public void insert( Account account );

    /**
     * TODO
     * 
     * @param account
     */
    public void update( Account account );

    /**
     * TODO
     * 
     * @param account
     */
    public void delete( String number );

    /**
     * TODO Varsha
     */
    public void upload();
    
    /**
     * @param number
     * @return
     */
    public Map<String, Account> selectAll();

}
