/*
 * @projectName myspring
 * @package com.cjq.spring.jdbc.service
 * @className com.cjq.spring.jdbc.service.IUserService
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.jdbc.service;

import com.cjq.spring.jdbc.bean.User;

import java.util.List;

/**
 * IUserService
 * @description TODO
 * @author chenjunqi
 * @date 2020年08月05日 8:59 下午
 * @version 3.0.0
 */
public interface IUserService {

    void save(User user);

    List<User> getUsers();

    List<User> getUserById();
}
