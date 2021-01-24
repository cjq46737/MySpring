/*
 * @projectName myspring
 * @package com.cjq.spring.mybatis
 * @className com.cjq.spring.mybatis.MybatisUtil
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.mybatis;

import com.cjq.spring.mybatis.bean.User;
import com.cjq.spring.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * MybatisUtil
 * @description TODO
 * @author chenjunqi
 * @date 2021年01月20日 9:56 下午
 * @version 3.0.0
 */
public class MybatisUtil {

    private final static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "MybatisConfig.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.insertUser(new User(1, "cjq", 18));
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void select() {
        SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUser(1);
            System.out.println(user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

}
