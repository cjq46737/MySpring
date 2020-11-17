/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.dynamicproxy.jdkproxy
 * @className com.cjq.spring.proxy.dynamicproxy.jdkproxy.MyInvocationHandler
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * MyInvocationHandler
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月20日 9:17 下午
 * @version 3.0.0
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();

        MyInvocationHandler handler = new MyInvocationHandler(userService);

        IUserService proxy = (IUserService) handler.getProxy();

        proxy.add();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is before add method...........");
        Object result = method.invoke(target, args);
        System.out.println("this is after add method...........");
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

}
