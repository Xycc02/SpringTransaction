package com.xuyuchao.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-23-15:52
 * @Description:
 */
public class druidTest {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        DataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        try {
            Connection con = dataSource.getConnection();
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
