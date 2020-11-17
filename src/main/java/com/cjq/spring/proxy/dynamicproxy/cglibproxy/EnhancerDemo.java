/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.dynamicproxy.cglibproxy
 * @className com.cjq.spring.proxy.dynamicproxy.cglibproxy.EnhancerDemo
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * EnhancerDemo
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月21日 9:39 下午
 * @version 3.0.0
 */
public class EnhancerDemo {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        enhancer.setCallback(new MethodInterceptorImpl());

        EnhancerDemo demo = (EnhancerDemo) enhancer.create();
        demo.test();

        System.out.println(demo);

    }

    public void test() {
        System.out.println("EnhancerDemo test..........");
    }

    private static class MethodInterceptorImpl implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println(method.getName() + " before method execute...........");
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println(method.getName() + " after method execute..............");
            return result;
        }
    }
}
