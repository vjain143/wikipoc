package com.wiki.service;

import java.util.List;

import com.wiki.dto.AccountDTO;

public interface AccountDataService
{
    int insertAccountData( final AccountDTO accountDTO );

    int updateAccountData( final AccountDTO accountDTO );

    int deleteAccountData( final String accountId );

    AccountDTO selectAccountData( final String accountId );

    List<AccountDTO> selectAllAccountData();

    List<AccountDTO> selectCachedAccountData();
}
