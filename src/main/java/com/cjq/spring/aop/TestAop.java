/*
 * @projectName myspring
 * @package com.cjq.spring.aop
 * @className com.cjq.spring.aop.TestAop
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.aop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestAop
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月28日 9:53 下午
 * @version 3.0.0
 */
@Getter
@Setter
public class TestAop {

    private String testStr = "testStr";

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        TestAop testAop = (TestAop) ac.getBean("testAop");
        testAop.test();

        //        List<String> list = new ArrayList<>();
        //        list.add("a");
        //        System.out.println(list);
        //        list.add(0, "b");
        //        System.out.println(list);
    }

    public void test() {
        System.out.println("this is " + testStr);
    }
}
