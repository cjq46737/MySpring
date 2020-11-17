/*
 * @projectName myspring
 * @package com.cjq.spring.beanpostprocessor
 * @className com.cjq.spring.beanpostprocessor.CjqTest
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.beanpostprocessor;

import com.cjq.spring.beanpostprocessor.aspect.CjqAnnotation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * CjqTest
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月08日 6:28 下午
 * @version 3.0.0
 */
@Getter
@Setter
public class CjqTest {

    @CjqAnnotation("cjq2Service")
    private ICjqService cjqService;

    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanpostprocessor.xml"));
        BeanPostProcessor cjqProcessor1 = (BeanPostProcessor) factory.getBean("cjqProcessor");
        factory.addBeanPostProcessor(cjqProcessor1);
        CjqTest cjqTest = (CjqTest) factory.getBean("cjqTest");
        cjqTest.getCjqService().sayCjq();
    }

}
