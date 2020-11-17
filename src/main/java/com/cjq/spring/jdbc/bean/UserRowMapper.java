/*
 * @projectName myspring
 * @package com.cjq.spring.jdbc
 * @className com.cjq.spring.jdbc.bean.UserRowMapper
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.jdbc.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * UserRowMapper
 * @description TODO
 * @author chenjunqi
 * @date 2020年08月05日 8:52 下午
 * @version 3.0.0
 */
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(resultSet.getInt("c_bh"), resultSet.getString("c_name"), resultSet.getInt("n_age"), resultSet.getString("c_sex"));
    }
}
