/*
 * @projectName myspring
 * @package com.cjq.spring.applicationEventMulticaster
 * @className com.cjq.spring.applicationEventMulticaster.TestListener
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.applicationEventMulticaster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestListener
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月21日 5:00 下午
 * @version 3.0.0
 */
public class TestListener implements ApplicationListener {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationEventMulticaster.xml");
        TestEvent event = new TestEvent("###", "hello spring");
        ac.publishEvent(event);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof TestEvent) {
            TestEvent testEvent = (TestEvent) event;
            testEvent.print();
        }
    }
}
