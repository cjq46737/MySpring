/*
 * @projectName myspring
 * @package com.cjq.spring.jdbc
 * @className com.cjq.spring.jdbc.bean.User
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.jdbc.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User
 * @description TODO
 * @author chenjunqi
 * @date 2020年08月05日 8:50 下午
 * @version 3.0.0
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String sex;
}
