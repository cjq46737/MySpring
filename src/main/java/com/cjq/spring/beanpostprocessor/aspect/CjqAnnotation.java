package com.cjq.spring.beanpostprocessor.aspect;

import java.lang.annotation.*;

/**
 * CjqAspect
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月08日 5:53 下午
 * @version 3.0.0
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CjqAnnotation {

    String value() default "cjq1Service";
}
