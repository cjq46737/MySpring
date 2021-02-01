/*
 * @projectName myspring
 * @package com.cjq.spring.transaction.service
 * @className com.cjq.spring.transaction.service.UserService
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.transaction.service;

import com.cjq.spring.transaction.po.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * UserService
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月01日 9:33 下午
 * @version 3.0.0
 */
public class UserService {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //    @Transactional
    public void save(User user) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert into user(id,name,age) values (?,?,?)", new Object[] { user.getId(), user.getName(), user.getAge() },
                new int[] { Types.INTEGER, Types.VARCHAR, Types.INTEGER });
        throw new RuntimeException("aa");
    }
}
