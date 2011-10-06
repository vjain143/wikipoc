package com.wiki.service;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.wiki.AllTests;
import com.wiki.dto.AccountDTO;

public class AccountDataServiceTest extends TestCase
{
    /**
     * 
     */
    private AccountDataService accountDataService;

    @Before
    public void setUp()
    {
        this.accountDataService = (AccountDataService) AllTests.CONTEXT.getBean( "accountDataService" );
    }

    @Test
    public void testselectCachedAccountData()
    {
        List<AccountDTO> accountListDTO1 = accountDataService.selectCachedAccountData();
        assertEquals( accountListDTO1.isEmpty(), false );

        List<AccountDTO> accountListDTO2 = accountDataService.selectCachedAccountData();
        assertEquals( accountListDTO2.isEmpty(), false );

        List<AccountDTO> accountListDTO3 = accountDataService.selectCachedAccountData();
        assertEquals( accountListDTO3.isEmpty(), false );

        List<AccountDTO> accountListDTO4 = accountDataService.selectCachedAccountData();
        assertEquals( accountListDTO4.isEmpty(), false );

        List<AccountDTO> accountListDTO5 = accountDataService.selectCachedAccountData();
        assertEquals( accountListDTO5.isEmpty(), false );
    }

}
