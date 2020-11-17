/*
 * @projectName myspring
 * @package com.cjq.spring.applicationEventMulticaster
 * @className com.cjq.spring.applicationEventMulticaster.TestEvent
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.applicationEventMulticaster;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * TestEvent
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月21日 4:57 下午
 * @version 3.0.0
 */
public class TestEvent extends ApplicationEvent implements Serializable {

    private String msg;

    /**
     * Create a new {@code ApplicationEvent}.
     * @param source the object on which the event initially occurred or with
     * which the event is associated (never {@code null})
     */
    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public static void main(String[] args) {
        System.out.println(ArrayList.class.isAssignableFrom(Object.class));
        System.out.println(Object.class.isAssignableFrom(ArrayList.class));
    }

    public void print() {
        System.out.println("this is cjq " + msg);
    }

    class A {

    }
}
