/*
 * @projectName myspring
 * @package com.cjq.spring.beanfactorypostprocessor
 * @className com.cjq.spring.beanfactorypostprocessor.SimplePostProcessor
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.beanfactorypostprocessor;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * SimplePostProcessor
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月17日 8:45 下午
 * @version 3.0.0
 */
@Setter
@ToString
public class SimplePostProcessor {

    private String connectionString;

    private String username;

    private String password;

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("BeanFactoryPostProcessor.xml"));
        BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) xmlBeanFactory.getBean("orbfpp");
        bfpp.postProcessBeanFactory(xmlBeanFactory);
        System.out.println(xmlBeanFactory.getBean("simplePostProcessor"));
    }
}
