package com.mxt.controller;

import com.mxt.domain.Account;
import com.mxt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {


    //依赖注入
    @Autowired(required = false)
    private AccountService accountService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        System.out.println("表现层:查询所有的账号");

        //调用service的方法
        List<Account> list=accountService.findAll();
        for (Account account:list
        ) {System.out.println(account);
        }
        ModelAndView mv=new ModelAndView();
        mv.setViewName("suc");
        return mv;
    }


    @RequestMapping("/save.do")
    public String save(Account account){
        //调用service，保存数据
        accountService.save(account);
        return "suc";
    }
}
