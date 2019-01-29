package com.cr.param;

import com.cr.BaseTest;
import com.cr.dao.param.MultiParamMapper;
import com.cr.dao.param.MultiParamUseAnnotationMapper;
import com.cr.dao.param.SingleParamMapper;
import com.cr.dao.param.SingleParamUseAnnotationMapper;
import com.cr.entity.Company;
import com.cr.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class ParamTest extends BaseTest {

    @Test
    public void testSingleParam() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            SingleParamMapper paramMapper = sqlSession.getMapper(SingleParamMapper.class);

            /*User user = paramMapper.selectUserById(1);
            System.out.println(user);

            List<User> users = paramMapper.selectUserByName("%girls%");
            System.out.println(users);

            User obj = new User();
            obj.setUserId(1);
            User user = paramMapper.selectUserByUser(obj);
            System.out.println(user);

            Map<String, Object> map = new HashMap<>();
            map.put("userId", 1);
            User user = paramMapper.selectUserByMap(map);
            System.out.println(user);

            User user = paramMapper.selectUserByIds(Arrays.asList(1, 2, 3));
            System.out.println(user);*/
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSingleParamUseAnnotation() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            SingleParamUseAnnotationMapper paramMapper = sqlSession.getMapper(SingleParamUseAnnotationMapper.class);
            /*User user = paramMapper.selectUserById(1);
            System.out.println(user);*/

            /*List<User> users = paramMapper.selectUserByName("%girls%");
            System.out.println(users);*/

            /*User obj = new User();
            obj.setUserId(1);
            User user = paramMapper.selectUserByUser(obj);
            System.out.println(user);*/

            /*Map<String, Object> map = new HashMap<>();
            map.put("userId", 1);
            User user = paramMapper.selectUserByMap(map);
            System.out.println(user);*/

            /*User user = paramMapper.selectUserByIds(Arrays.asList(1, 2, 3));
            System.out.println(user);*/
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testMultiParam() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            MultiParamMapper paramMapper = sqlSession.getMapper(MultiParamMapper.class);

            /*User user = paramMapper.selectUser1(1, "girls");
            System.out.println(user);*/

            /*Company company = new Company();
            company.setCompanyId(1);
            User user = paramMapper.selectUser2(1, company);
            System.out.println(user);*/

            /*User user = paramMapper.selectUser3(Arrays.asList(1, 2, 3), "girls");
            System.out.println(user);*/
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testMultiParamUseAnnotation() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            MultiParamUseAnnotationMapper paramMapper = sqlSession.getMapper(MultiParamUseAnnotationMapper.class);

            /*User user = paramMapper.selectUser1(1, "girls");
            System.out.println(user);*/

            /*Company company = new Company();
            company.setCompanyId(1);
            User user = paramMapper.selectUser2(1, company);
            System.out.println(user);*/

            /*Company company = new Company();
            company.setCompanyId(1);
            User user = paramMapper.selectUser3(1, company);
            System.out.println(user);*/
        } finally {
            sqlSession.close();
        }
    }

}
