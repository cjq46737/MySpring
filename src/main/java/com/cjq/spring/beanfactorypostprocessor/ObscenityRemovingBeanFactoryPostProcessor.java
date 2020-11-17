/*
 * @projectName myspring
 * @package com.cjq.spring.beanfactorypostprocessor
 * @className com.cjq.spring.beanfactorypostprocessor.ObscenityRemovingBeanFactoryPostProcessor
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

/**
 * ObscenityRemovingBeanFactoryPostProcessor
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月17日 8:30 下午
 * @version 3.0.0
 */
public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private Set<String> obscenities;

    public ObscenityRemovingBeanFactoryPostProcessor() {
        this.obscenities = new HashSet<>();
    }

    public void setObscenities(Set<String> obscenities) {
        this.obscenities.clear();
        obscenities.forEach(item -> this.obscenities.add(item.toUpperCase()));
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            StringValueResolver valueResolver = new StringValueResolver() {
                @Override
                public String resolveStringValue(String strVal) {
                    if (isObscenity(strVal)) {
                        return "*****";
                    }
                    return strVal;
                }

            };
            BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
            visitor.visitBeanDefinition(beanDefinition);
        }
    }

    private boolean isObscenity(String strVal) {
        return obscenities.contains(strVal.toUpperCase());
    }
}
