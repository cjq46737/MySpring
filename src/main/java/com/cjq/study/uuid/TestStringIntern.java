/*
 * @projectName myspring
 * @package com.cjq.study.uuid
 * @className com.cjq.study.uuid.TestStringIntern
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.study.uuid;

/**
 * TestStringIntern
 * @description TODO
 * @author chenjunqi
 * @date 2020年09月22日 9:59 下午
 * @version 3.0.0
 */
public class TestStringIntern {

    public static void main(String[] args) {
        int loop = 5000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            String.valueOf(i);
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            String.valueOf(i).intern();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
