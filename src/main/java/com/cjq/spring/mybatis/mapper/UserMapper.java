/*
 * @projectName myspring
 * @package com.cjq.spring.mybatis.mapper
 * @className com.cjq.spring.mybatis.mapper.UserMapper
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.mybatis.mapper;

import com.cjq.spring.mybatis.bean.User;

/**
 * UserMapper
 * @description TODO
 * @author chenjunqi
 * @date 2021年01月18日 9:52 下午
 * @version 3.0.0
 */
public interface UserMapper {

    void insertUser(User user);

    User getUser(Integer id);
}
