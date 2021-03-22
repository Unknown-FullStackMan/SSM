package com.mxt.mapper;

import com.mxt.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    @Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
    void save(Account account);
}
