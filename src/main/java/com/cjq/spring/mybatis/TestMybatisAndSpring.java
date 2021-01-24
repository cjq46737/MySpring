/*
 * @projectName myspring
 * @package com.cjq.spring.mybatis
 * @className com.cjq.spring.mybatis.TestMybatisAndSpring
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.mybatis;

import com.cjq.spring.mybatis.bean.User;
import com.cjq.spring.mybatis.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestMybatisAndSpring
 * @description TODO
 * @author chenjunqi
 * @date 2021年01月24日 8:46 下午
 * @version 3.0.0
 */
public class TestMybatisAndSpring {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis-spring.xml");
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User user = userMapper.getUser(1);
        System.out.println(user);
    }
}
