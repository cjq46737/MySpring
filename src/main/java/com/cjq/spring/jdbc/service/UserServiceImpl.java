/*
 * @projectName myspring
 * @package com.cjq.spring.jdbc.service
 * @className com.cjq.spring.jdbc.service.UserServiceImpl
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.jdbc.service;

import com.cjq.spring.jdbc.bean.User;
import com.cjq.spring.jdbc.bean.UserRowMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * UserServiceImpl
 * @description TODO
 * @author chenjunqi
 * @date 2020年10月19日 8:01 下午
 * @version 3.0.0
 */
public class UserServiceImpl implements IUserService {
    //public class UserServiceImpl {
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        IUserService userService = (IUserService) bf.getBean("userService");
        //        userService.save(new User(11, "sdf", 10, "man"));
        List<User> users = userService.getUsers();
        System.out.println(users);

        List<User> u1 = userService.getUserById();
        System.out.println(u1);

    }

    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into spring.user_cjq(c_bh,c_name,n_age,c_sex) values (?,?,?,?)",
                new Object[] { user.getId(), user.getName(), user.getAge(), user.getSex() });
    }

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query("select * from spring.user_cjq", new UserRowMapper());
    }

    @Override
    public List<User> getUserById() {
        return jdbcTemplate.query("select * from spring.user_cjq where n_age = ?", new Object[] { 10 }, new int[] { Types.INTEGER },
                new UserRowMapper());
    }
}
