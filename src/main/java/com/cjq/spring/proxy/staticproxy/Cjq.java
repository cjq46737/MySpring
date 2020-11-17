/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.staticproxy
 * @className com.cjq.spring.proxy.staticproxy.Cjq
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.staticproxy;

/**
 * Cjq
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月26日 11:02 上午
 * @version 3.0.0
 */
public class Cjq implements ICjq {
    @Override
    public void speak() {
        System.out.println("this is cjq class........");
    }
}
