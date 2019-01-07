package com.cr;

import com.cr.dao.UserMapper;
import com.cr.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UserTest {

    public SqlSessionFactory getSqlSessionFactory() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    @Test
    public void testOriginal() {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            User user = session.selectOne("com.cr.dao.UserMapper.selectUser", 2);
            System.out.println(user);
        } finally {
            session.close();
        }
    }

    @Test
    public void testInterface() {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = userMapper.selectUser(2);
            System.out.println(user);
        } finally {
            session.close();
        }
    }

    @Test
    public void testAnnotation() {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            String name = userMapper.selectUserName(2);
            System.out.println(name);
        } finally {
            session.close();
        }
    }

    @Test
    public void testAdd() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            User user = new User();
            user.setName("lady");
            user.setNickName("女人");
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(mapper.addUser(user));
            System.out.println(user.getUid());
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.updateUser(new User(5, "model", "模特")));
            System.out.println(userMapper.updateUserNickName(5, "模特儿"));
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteUser(2);
        }finally {
            sqlSession.close();
        }
    }

}
