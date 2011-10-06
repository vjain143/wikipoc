package com.wiki.service.impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import com.googlecode.ehcache.annotations.Cacheable;
import com.wiki.dto.AccountDTO;
import com.wiki.service.AccountDataService;
public class AccountDataServiceImpl implements AccountDataService
{
    private static final Logger            LOG = Logger.getLogger( AccountDataServiceImpl.class );
    private static Map<String, AccountDTO> allaccountMap;

    private static Map<String, AccountDTO> allaccountCachedMap;

    static
    {
        LOG.info( "AccountDataService preparing default data for account id 00001001,00001002" );
        allaccountMap = new HashMap<String, AccountDTO>();
        AccountDTO accountDTO1 = new AccountDTO();
        accountDTO1.setAccountId( "00001001" );
        accountDTO1.setAccountHolderName( "John" );
        accountDTO1.setAccountContactNo( "02023456789" );
        accountDTO1.setCurrency( "EUR" );
        accountDTO1.setAccountEmail( "john@gmail.com" );
        accountDTO1.setAccountDOB( "12-12-1979" );
        allaccountMap.put( accountDTO1.getAccountId(), accountDTO1 );

        AccountDTO accountDTO2 = new AccountDTO();
        accountDTO2.setAccountId( "00001002" );
        accountDTO2.setAccountHolderName( "Rohan" );
        accountDTO2.setAccountContactNo( "02034567890" );
        accountDTO2.setCurrency( "CHF" );
        accountDTO2.setAccountEmail( "rohan@gmail.com" );
        accountDTO2.setAccountDOB( "10-10-1979" );

        allaccountMap.put( accountDTO2.getAccountId(), accountDTO2 );

        allaccountCachedMap = allaccountMap;
    }

    public int insertAccountData( AccountDTO accountDTO )
    {
        LOG.info( "AccountDataService insertAccountData for account Id " + accountDTO.getAccountId() );
        allaccountMap.put( accountDTO.getAccountId(), accountDTO );
        return 0;
    }

    public int updateAccountData( AccountDTO accountDTO )
    {
        LOG.info( "AccountDataService updateAccountData for account Id " + accountDTO.getAccountId() );
        allaccountMap.put( accountDTO.getAccountId(), accountDTO );
        return 0;
    }

    public int deleteAccountData( String accountId )
    {
        LOG.info( "AccountDataService deleteAccountData for account Id " + accountId );
        allaccountMap.remove( accountId );
        return 0;
    }

    public AccountDTO selectAccountData( String accountId )
    {
        LOG.info( "AccountDataService selectAccountData for account Id " + accountId );
        return allaccountMap.get( accountId );
    }

    public List<AccountDTO> selectAllAccountData()
    {
        LOG.info( "AccountDataService selectAllAccountData" );
        List<AccountDTO> accountdatalist = new ArrayList<AccountDTO>();
        for ( Iterator<AccountDTO> it = allaccountMap.values().iterator(); it.hasNext(); )
        {
            AccountDTO accountDTO = it.next();
            accountdatalist.add( accountDTO );
        }
        return accountdatalist;
    }

    @Cacheable(cacheName = "selectCachedAccountData")
    public List<AccountDTO> selectCachedAccountData()
    {
        LOG.info( "AccountDataService selectCachedAccountData" );
        List<AccountDTO> accountdatalist = new ArrayList<AccountDTO>();
        for ( Iterator<AccountDTO> it = allaccountCachedMap.values().iterator(); it.hasNext(); )
        {
            AccountDTO accountDTO = it.next();
            accountdatalist.add( accountDTO );
        }
        return accountdatalist;
    }
}