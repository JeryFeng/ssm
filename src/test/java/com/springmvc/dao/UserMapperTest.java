package com.springmvc.dao;

import com.springmvc.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private UserMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(UserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() {
        User message = new User();
        message.setId(123456789L);
        message.setPassword("123456");
        message.setUserName("打豆豆");
        int result = mapper.insert(message);
        System.out.println(result);
        assert (result == 1);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void updateUser(){
        mapper.updateUser(123456789L);
    }
}