package com.cr.resultMap;

import com.cr.BaseTest;
import com.cr.dao.resultMap.ResultMapCollectionMapper;
import com.cr.dao.resultMap.ResultMapMapper;
import com.cr.entity.Company;
import com.cr.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class ResultMapTest extends BaseTest {

    @Test
    public void testSelectResultMap() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            ResultMapMapper mapper = sqlSession.getMapper(ResultMapMapper.class);
            User user = mapper.selectResultMap(1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectResultMapWithAssociation() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            ResultMapMapper mapper = sqlSession.getMapper(ResultMapMapper.class);
            User user = mapper.selectResultMapWithAssociation(1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectResultMapWithAssociationAndStep() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            ResultMapMapper mapper = sqlSession.getMapper(ResultMapMapper.class);
            User user = mapper.selectResultMapWithAssociationAndStep(1);
            System.out.println(user.getUserId());
            System.out.println(user.getCompany());
            System.out.println(user.getCity());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectResultMapCollection() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            ResultMapCollectionMapper mapper = sqlSession.getMapper(ResultMapCollectionMapper.class);
            Company company = mapper.selectResultMapCollection(1);
            System.out.println(company);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectResultMapCollectionWithStep() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            ResultMapCollectionMapper mapper = sqlSession.getMapper(ResultMapCollectionMapper.class);
            Company company = mapper.selectResultMapCollectionWithStep(1);
            System.out.println(company.getCompanyId());
            System.out.println(company);
        } finally {
            sqlSession.close();
        }
    }

}
