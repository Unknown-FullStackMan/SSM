package com.mxt.test;

import com.mxt.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testSpring {
    @Test
    public void run1(){
        //创建工厂，加载配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取service对象，调用方法
        AccountService service=applicationContext.getBean(AccountService.class);
        service.findAll();
    }
}
