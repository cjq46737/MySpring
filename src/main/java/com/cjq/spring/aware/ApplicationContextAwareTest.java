/*
 * @projectName myspring
 * @package com.cjq.spring.aware
 * @className com.cjq.spring.aware.ApplicationContextAware
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContextAware
 * @description TODO
 * @author chenjunqi
 * @date 2020年08月24日 9:19 下午
 * @version 3.0.0
 */
public class ApplicationContextAwareTest implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("textAware.xml");
        ApplicationContextAwareTest testAware = (ApplicationContextAwareTest) ac.getBean("ApplicationContextAwareTest");
        Hello hello = (Hello) testAware.getBean("hello");
        hello.say();

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }
}
