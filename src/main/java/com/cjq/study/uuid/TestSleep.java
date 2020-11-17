/*
 * @projectName myspring
 * @package com.cjq.study.uuid
 * @className com.cjq.study.uuid.TestSleep
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.study.uuid;

/**
 * TestSleep
 * @description TODO
 * @author chenjunqi
 * @date 2020年09月20日 7:30 下午
 * @version 3.0.0
 */
public class TestSleep {

    public static void main(String[] args) {
        TestSleep ts = new TestSleep();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ts.f();
            }
        }, "cjq");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ts.f();
            }
        }, "lsy");
        t1.start();
        t2.start();
    }

    public synchronized void f() {
        try {
            System.out.println(Thread.currentThread().getName() + " get lock");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " release lock");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
