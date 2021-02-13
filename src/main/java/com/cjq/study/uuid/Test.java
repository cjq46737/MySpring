/*
 * @projectName myspring
 * @package com.cjq.study.uuid
 * @className com.cjq.study.uuid.Test
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.study.uuid;

import com.cjq.spring.jdbc.bean.User;
import org.springframework.aop.IntroductionAwareMethodMatcher;
import org.springframework.aop.support.StaticMethodMatcher;

import java.lang.reflect.Method;

/**
 * Test
 * @description TODO
 * @author chenjunqi
 * @date 2020年09月13日 10:09 上午
 * @version 3.0.0
 */
public class Test {

    public static void main(String[] args) {
        StaticMethodMatcher staticMethodMatcher = new StaticMethodMatcher() {
            @Override
            public boolean matches(Method method, Class<?> targetClass) {
                return false;
            }
        };
        System.out.println(staticMethodMatcher instanceof IntroductionAwareMethodMatcher);

        ClassLoader classLoader = Test.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        System.out.println(parent.getParent());

        ClassLoader classLoader1 = User.class.getClassLoader();
        System.out.println(classLoader1);
        ClassLoader parent1 = classLoader1.getParent();
        System.out.println(parent1);
        System.out.println(parent1.getParent());
    }
}
