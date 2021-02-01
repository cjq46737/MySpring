/*
 * @projectName myspring
 * @package com.cjq.spring.transaction.po
 * @className com.cjq.spring.transaction.po.User
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.transaction.po;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月01日 9:18 下午
 * @version 3.0.0
 */
@Data
@AllArgsConstructor
public class User {

    private int id;

    private String name;

    private int age;
}
