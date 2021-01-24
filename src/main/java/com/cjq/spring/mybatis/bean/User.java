/*
 * @projectName myspring
 * @package com.cjq.spring.mybatis
 * @className com.cjq.spring.mybatis.bean.User
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.mybatis.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * User
 * @description TODO
 * @author chenjunqi
 * @date 2021年01月18日 9:49 下午
 * @version 3.0.0
 */
@Data
@AllArgsConstructor
@ToString
public class User {

    private Integer id;

    private String name;

    private Integer age;

}
