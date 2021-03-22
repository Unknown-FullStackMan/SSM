//package com.mxt.test;
//
//import com.mxt.domain.Account;
//import com.mxt.mapper.AccountMapper;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class TestMybatis {
//
//    @Test
//    public void run2() throws IOException {
//        //加载配置文件
//        InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig.xml");
//        //构建工厂
//        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
//        //创建session
//        SqlSession session=factory.openSession();
//        //获取代理对象
//        AccountMapper mapper=session.getMapper(AccountMapper.class);
//        List<Account> list=mapper.findAll();
//        for (Account account:list
//             ) {System.out.println(account);
//        }
//        session.close();
//        inputStream.close();
//    }
//}
