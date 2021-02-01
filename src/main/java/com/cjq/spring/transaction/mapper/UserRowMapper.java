/*
 * @projectName myspring
 * @package com.cjq.spring.transaction.mapper
 * @className com.cjq.spring.transaction.mapper.UserRowMapper
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.transaction.mapper;

import com.cjq.spring.transaction.po.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * UserRowMapper
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月01日 9:30 下午
 * @version 3.0.0
 */
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"));
    }
}
