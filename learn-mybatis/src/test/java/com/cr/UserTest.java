package com.cr;

import com.cr.dao.CompanyMapperResultMap;
import com.cr.dao.UserMapper;
import com.cr.dao.UserMapperResultMap;
import com.cr.entity.Company;
import com.cr.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

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
            User user = userMapper.selectUserById(1);
            System.out.println(user);

            List<User> users = userMapper.selectUsers();
            for (User u : users) {
                System.out.println(u);
            }

            Map<String, Object> mapUser = userMapper.selectMapUser(1);
            System.out.println(mapUser);

            Map<Integer, User> mapUsers = userMapper.selectMapUsers();
            System.out.println(mapUsers);
        } finally {
            session.close();
        }
    }

    @Test
    public void testResultMap() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            //UserMapperResultMap mapperResultMap = sqlSession.getMapper(UserMapperResultMap.class);
            //System.out.println(mapperResultMap.selectResultMapAssociation(1));
            //User user = mapperResultMap.selectResultMapAssociationWithStep(1);
            //System.out.println(user.getUserId());
            //System.out.println(user.getCompany());
            //System.out.println(user.getCity());
            CompanyMapperResultMap mapperResultMap = sqlSession.getMapper(CompanyMapperResultMap.class);
            //System.out.println(mapperResultMap.selectResultMapCollection(1));
            Company company = mapperResultMap.selectResultMapCollectionWithStep(1);
            System.out.println(company.getCompanyId());
            System.out.println(company.getUsers());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testAnnotation() {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            String name = userMapper.selectUserName(1);
            System.out.println(name);
        } finally {
            session.close();
        }
    }

    @Test
    public void testAdd() throws Exception {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            User user = new User();
            user.setName("daughter");
            user.setNickName("白菜");

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(mapper.addUser(user));
            System.out.println(user.getUserId());

            User lastUser = mapper.selectUserById(user.getUserId());
            System.out.println(lastUser);

            System.out.println(mapper.updateUserNickName(lastUser.getUserId(), "女儿"));

            lastUser = mapper.selectUserById(user.getUserId());
            System.out.println(lastUser);

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
           /* UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.updateUser(new User(5, "model", "模特", new Company())));
            System.out.println(userMapper.updateUserNickName(5, "模特儿"));*/
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteUser(17);
        } finally {
            sqlSession.close();
        }
    }

}
