/*
 * @projectName myspring
 * @package com.cjq.spring.circle
 * @className com.cjq.spring.circle.TestA
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.circle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TestA
 * @description TODO
 * @author chenjunqi
 * @date 2020年05月05日 11:45 上午
 * @version 3.0.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestA {

    private TestB testB;

    public void a(){
        testB.b();
    }
}
