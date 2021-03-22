package com.mxt.service;

import com.mxt.domain.Account;
import com.mxt.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有的账号");
        return accountMapper.findAll();
    }

    @Override
    public void save(Account account) {
        accountMapper.save(account);
    }
}
