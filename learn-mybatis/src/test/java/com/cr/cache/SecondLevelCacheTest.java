package com.cr.cache;

import com.cr.BaseTest;
import com.cr.dao.cache.LocalCacheMapper;
import com.cr.dao.cache.SecondLevelCacheMapper;
import com.cr.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;

public class SecondLevelCacheTest extends BaseTest {

    @Test
    public void testSecondLevelCache() throws IOException {
        SqlSessionFactory sessionFactory = getSqlSessionFactory();
        SqlSession session1 = sessionFactory.openSession();
        SqlSession session2 = sessionFactory.openSession();
        SecondLevelCacheMapper mapper1 = session1.getMapper(SecondLevelCacheMapper.class);
        SecondLevelCacheMapper mapper2 = session2.getMapper(SecondLevelCacheMapper.class);

        User user1 = mapper1.selectUserById(1);
        System.out.println(user1);
        session1.close();

        User user2 = mapper2.selectUserById(1);
        System.out.println(user2);
        session2.close();
    }

}
