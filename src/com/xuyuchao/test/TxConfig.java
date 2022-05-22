package com.xuyuchao.test;

import com.xuyuchao.Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-23-23:36
 * @Description:
 */
public class TxConfig {
    /**
     * 完全注解开发测试事务
     */
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.account();
    }
}
