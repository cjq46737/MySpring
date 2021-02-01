/*
 * @projectName myspring
 * @package com.cjq.spring.transaction
 * @className com.cjq.spring.transaction.TestTransaction
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.transaction;

import com.cjq.spring.transaction.po.User;
import com.cjq.spring.transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestTransaction
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月01日 9:45 下午
 * @version 3.0.0
 */
public class TestTransaction {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-transaction.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.save(new User(2, "cjq", 3));
    }
}
