/*
 * @projectName myspring
 * @package com.cjq.spring.beanpostprocessor
 * @className com.cjq.spring.beanpostprocessor.Cjq1Service
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.beanpostprocessor;

import org.springframework.stereotype.Service;

/**
 * Cjq1Service
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月08日 5:34 下午
 * @version 3.0.0
 */
@Service
public class Cjq1Service implements ICjqService {

    @Override
    public void sayCjq() {
        System.out.println("yes he is cool.......");
    }
}
