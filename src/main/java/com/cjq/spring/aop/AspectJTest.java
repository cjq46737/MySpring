/*
 * @projectName myspring
 * @package com.cjq.spring.aop
 * @className com.cjq.spring.aop.AspectJTest
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * AspectJTest
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月28日 9:54 下午
 * @version 3.0.0
 */
@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.test(..))")
    public void cjq() {

    }

    @After("cjq()")
    public void afterTest() {
        System.out.println("after test.....");
    }

    @Before("cjq()")
    public void beforeTest() {
        System.out.println("before test.....");
    }

    @Around("cjq()")
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("cjq is cool ,let`s start.......");
        Object result = null;
        try {
            result = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("cjq is cool, ending......");
        return result;
    }
}
