package com.mxt.service;

import com.mxt.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void save(Account account);
}
