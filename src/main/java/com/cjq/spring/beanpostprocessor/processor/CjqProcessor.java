/*
 * @projectName myspring
 * @package com.cjq.spring.beanpostprocessor.processor
 * @className com.cjq.spring.beanpostprocessor.processor.CjqProcessor
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.beanpostprocessor.processor;

import com.cjq.spring.beanpostprocessor.aspect.CjqAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * CjqProcessor
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月08日 5:56 下午
 * @version 3.0.0
 */
public class CjqProcessor implements BeanPostProcessor, ApplicationContextAware {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(CjqAnnotation.class)) {
                Map<String, ?> beansOfType = applicationContext.getBeansOfType(field.getType());
                field.setAccessible(true);
                try {
                    if (beansOfType.size() == 1) {
                        field.set(bean, beansOfType.values().iterator().next());
                    } else if (beansOfType.size() == 2) {
                        String value = field.getAnnotation(CjqAnnotation.class).value();
                        Object object = applicationContext.getBean(value);
                        field.set(bean, object);
                    } else {
                        throw new IllegalAccessException("field 类型个数异常！");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
