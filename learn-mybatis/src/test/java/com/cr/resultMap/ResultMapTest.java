package com.cr.resultMap;

import com.cr.BaseTest;
import com.cr.dao.resultMap.ResultMapMapper;
import com.cr.entity.Company;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class ResultMapTest extends BaseTest {

    @Test
    public void testResultMap() throws IOException {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            ResultMapMapper mapper = sqlSession.getMapper(ResultMapMapper.class);
            System.out.println(mapper.selectUser1(1));
            System.out.println(mapper.selectUser2(1));
            System.out.println(mapper.selectUser3(1));
            System.out.println(mapper.selectCompany1(1));
            System.out.println(mapper.selectCompany2(1));
        } finally {
            sqlSession.close();
        }
    }

}
