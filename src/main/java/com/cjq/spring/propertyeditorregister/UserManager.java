/*
 * @projectName myspring
 * @package com.cjq.spring.propertyeditorregister
 * @className com.cjq.spring.propertyeditorregister.UserManager
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.propertyeditorregister;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * UserManager
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月09日 5:07 下午
 * @version 3.0.0
 */
@Getter
@Setter
@ToString
public class UserManager {

    private Date date;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("PropertyEditorRegister.xml");
        UserManager um = (UserManager) ac.getBean("userManager");
        System.out.println(um);
    }

    @Test
    public void testPropertyEditorRegistar() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("PropertyEditorRegister2.xml");
        UserManager um = (UserManager) ac.getBean("userManager");
        System.out.println(um);
    }
}
