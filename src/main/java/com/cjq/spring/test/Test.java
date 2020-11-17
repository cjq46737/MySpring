/*
 * @projectName myspring
 * @package com.cjq.spring.test
 * @className com.cjq.spring.test.Test
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.test;

import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Test
 * @description TODO
 * @author chenjunqi
 * @date 2020年05月04日 9:46 上午
 * @version 3.0.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(BeanFactoryUtils.isFactoryDereference("&sd"));
    }

    @org.junit.Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircle() throws Throwable {
        try {
            ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Circle.xml");
        } catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }

    @org.junit.Test
    public void testPrototype() {
        //        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Prototype.xml");
        //        TestA testA = (TestA) classPathXmlApplicationContext.getBean("testA");
        //        System.out.println(testA);
    }

    @org.junit.Test
    public void testNewInteger() {
        Integer a = new Integer(2);
        Integer b = new Integer(2);
        System.out.println(a == b);

        Integer c = new Integer(225);
        Integer d = new Integer(225);
        System.out.println(c == d);
    }

    @org.junit.Test
    public void testCompareIntegerAndInt() {
        Integer a = new Integer(2);
        int b = 2;
        System.out.println(a == b);

        Integer c = new Integer(255);
        int d = 255;
        System.out.println(c == d);
    }

    @org.junit.Test
    public void testIntegerNull() {
        Integer a = null;
        int b = 8;
        System.out.println(b == a);
    }

    @org.junit.Test
    public void testIntegerValueOf() {
        Integer a = 2;
        Integer b = 2;
        System.out.println(a == b);

        Integer c = 227;
        Integer d = 227;
        System.out.println(c == d);
    }

    @org.junit.Test
    public void testStringReplace() {
        String s = "abcadadceaefae";
        System.out.println(s.replace("a", "0"));
    }

    @org.junit.Test
    public void testHashMap() {
        Map<String, String> hashMap = new HashMap<>(15);
        hashMap.put("", "");
        System.out.println(hashMap.size());
    }

}
