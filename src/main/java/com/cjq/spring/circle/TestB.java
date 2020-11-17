/*
 * @projectName myspring
 * @package com.cjq.spring.circle
 * @className com.cjq.spring.circle.TestB
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.circle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TestB
 * @description TODO
 * @author chenjunqi
 * @date 2020年05月05日 11:46 上午
 * @version 3.0.0
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestB {

    private TestC testC;

    public void b() {
        testC.c();
    }
}
