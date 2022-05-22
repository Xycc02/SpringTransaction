package com.xuyuchao.test;

import com.xuyuchao.Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-23-16:07
 * @Description:
 */
public class accountTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.account();
    }
}
