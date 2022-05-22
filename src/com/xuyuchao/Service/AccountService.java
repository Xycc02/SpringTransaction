package com.xuyuchao.Service;

import com.xuyuchao.UserDao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-23-15:59
 * @Description:
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = 5)
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    //转账操作
    public void account() {
        //张三减一百
        accountDao.reduceMoney();
        //int i = 10/0;
        //李四加一百
        accountDao.addMoney();
    }

}
