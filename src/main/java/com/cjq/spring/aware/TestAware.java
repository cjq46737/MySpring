/*
 * @projectName myspring
 * @package com.cjq.spring.aware
 * @className com.cjq.spring.aware.TestAware
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.aware;

import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestAware
 * @description TODO
 * @author chenjunqi
 * @date 2020年05月31日 7:24 下午
 * @version 3.0.0
 */
public class TestAware implements BeanFactoryAware {

    private  BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware(){
        Hello hello = (Hello) beanFactory.getBean("hello");
        hello.say();
    }

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("textAware.xml");
        TestAware testAware = (TestAware) ac.getBean("testAware");
        testAware.testAware();
    }
}
