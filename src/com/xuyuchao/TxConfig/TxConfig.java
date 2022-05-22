//package com.xuyuchao.TxConfig;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * @Author: xuyuchao
// * @Date: 2022-04-23-23:25
// * @Description:    完全注解开发
// */
//
////配置类
//@Configuration
////开启注解扫描
//@ComponentScan(basePackages = {"com.xuyuchao"})
////开启事务注解
//@EnableTransactionManagement
//public class TxConfig {
//
//    //配置连接池
//    @Bean
//    public DruidDataSource getDruidDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_transaction");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
//    //创建JdbcTemplate对象,往JdbcTemplate对象中注入druidDataSource属性
//    //形参的DataSource dataSource 会到ioc容器中根据类型找到dataSource
//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
//    //创建事务管理器
//    @Bean
//    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource);
//        return transactionManager;
//    }
//}
