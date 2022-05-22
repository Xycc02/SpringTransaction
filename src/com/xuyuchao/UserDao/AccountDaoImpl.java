package com.xuyuchao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-23-16:00
 * @Description:
 */
@Repository
public class AccountDaoImpl implements AccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 模拟李四加100
     */
    @Override
    public void addMoney() {
        String sql = "update account set money = money + ? where name = ?";
        jdbcTemplate.update(sql,100,"李四");
    }

    /**
     * 模拟张三减100
     */
    @Override
    public void reduceMoney() {
        String sql = "update account set money = money - ? where name = ?";
        jdbcTemplate.update(sql,100,"张三");
    }
}
