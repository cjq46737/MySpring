/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.staticproxy
 * @className com.cjq.spring.proxy.staticproxy.ICjqProxy
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.staticproxy;

/**
 * ICjqProxy
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月26日 11:02 上午
 * @version 3.0.0
 */
public class ICjqProxy implements ICjq {

    private ICjq cjq;

    public ICjqProxy(ICjq cjq) {
        this.cjq = cjq;
    }

    public static void main(String[] args) {
        ICjq cjq = new ICjqProxy(new Cjq());
        cjq.speak();
    }

    @Override
    public void speak() {
        System.out.println("before icjq speak.......");
        cjq.speak();
        System.out.println("after icjq speak.........");
    }
}
