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
import java.util.HashMap;
import java.util.Map;

public class ParamTest extends BaseTest {

    @Test
    public void testSingleParam() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            SingleParamMapper paramMapper = sqlSession.getMapper(SingleParamMapper.class);
            System.out.println(paramMapper.selectUserById(1));
            System.out.println(paramMapper.selectUserByUser(new User(1)));
            Map<String, Object> map = new HashMap<>();
            map.put("userId", 1);
            System.out.println(paramMapper.selectUserByMap(map));
            System.out.println(paramMapper.selectUserByIds(Arrays.asList(1, 2, 3)));
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSingleParamUseAnnotation() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            SingleParamUseAnnotationMapper paramMapper = sqlSession.getMapper(SingleParamUseAnnotationMapper.class);
            System.out.println(paramMapper.selectUserById(1));
            System.out.println(paramMapper.selectUserByUser(new User(1)));
            Map<String, Object> map = new HashMap<>();
            map.put("userId", 1);
            System.out.println(paramMapper.selectUserByMap(map));
            System.out.println(paramMapper.selectUserByIds(Arrays.asList(1, 2, 3)));
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testMultiParam() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            MultiParamMapper paramMapper = sqlSession.getMapper(MultiParamMapper.class);
            System.out.println(paramMapper.selectUser1(1, "girl"));
            System.out.println(paramMapper.selectUser2(1, new Company(1)));
            System.out.println(paramMapper.selectUser3(Arrays.asList(1, 2, 3), "girl"));
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testMultiParamUseAnnotation() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            MultiParamUseAnnotationMapper paramMapper = sqlSession.getMapper(MultiParamUseAnnotationMapper.class);
            System.out.println(paramMapper.selectUser1(1, "girl"));
            System.out.println(paramMapper.selectUser2(1, new Company(1)));
            System.out.println(paramMapper.selectUser3(1, new Company(1)));
        } finally {
            sqlSession.close();
        }
    }

}
