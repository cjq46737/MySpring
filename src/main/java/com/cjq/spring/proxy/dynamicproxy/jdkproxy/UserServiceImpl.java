/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.dynamicproxy.jdkproxy
 * @className com.cjq.spring.proxy.dynamicproxy.jdkproxy.UserServiceImpl
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.dynamicproxy.jdkproxy;

/**
 * UserServiceImpl
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月20日 9:16 下午
 * @version 3.0.0
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("this is add method.......");
    }
}
