/*
 * @projectName myspring
 * @package com.cjq.spring.contain.prepare
 * @className com.cjq.spring.contain.prepare.MyClasspathXmlApplicationContext
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.contain.prepare;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MyClasspathXmlApplicationContext
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月03日 10:03 下午
 * @version 3.0.0
 */
public class MyClasspathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClasspathXmlApplicationContext(String... configLocations){
        super(configLocations);
    }

    @Override
    public void initPropertySources(){
        getEnvironment().setRequiredProperties("VAR");
    }

    @Override
    public void customizeBeanFactory(DefaultListableBeanFactory beanFactory){
        super.setAllowBeanDefinitionOverriding(false);
        super.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }

    public static void main(String[] args) {
        ApplicationContext ac = new MyClasspathXmlApplicationContext("");
    }
}
