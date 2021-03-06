package com.example.mybatis.demomybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 如果测试是事务的方法，com.example.mybatis.demomybatis.controller.UserController#testTransactional()，
 * 直接把exclude去掉就可以，否则可能启动不起来
 * exclude = {DataSourceAutoConfiguration.class}
 * 如果使用spring-mybatis，把MapperScan注释放开
 */
@SpringBootApplication()
//@MapperScan(basePackages = "com.example.mybatis.demomybatis.dao")
public class DemoMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);
    }

}
