package com.cr.cache;

import com.cr.BaseTest;
import com.cr.dao.cache.LocalCacheMapper;
import com.cr.dao.cache.SecondLevelCacheMapper;
import com.cr.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;

public class LocalCacheTest extends BaseTest {

    @Test
    public void testLocalCache() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            LocalCacheMapper mapper = session.getMapper(LocalCacheMapper.class);
            User user1 = mapper.selectUserById(1);
            User user2 = mapper.selectUserById(1);
            System.out.println(user1 == user2);
        } finally {
            session.close();
        }
    }

    @Test
    public void testLocalCacheFail1() throws IOException {
        SqlSessionFactory sessionFactory = getSqlSessionFactory();
        SqlSession session1 = sessionFactory.openSession();
        try {
            LocalCacheMapper mapper1 = session1.getMapper(LocalCacheMapper.class);
            User user1 = mapper1.selectUserById(1);
            SqlSession session2 = sessionFactory.openSession();
            try {
                LocalCacheMapper mapper2 = session2.getMapper(LocalCacheMapper.class);
                User user2 = mapper2.selectUserById(1);
                System.out.println(user1 == user2);
            } finally {
                session2.close();
            }
        } finally {
            session1.close();
        }
    }

    @Test
    public void testLocalCacheFail2() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            LocalCacheMapper mapper = session.getMapper(LocalCacheMapper.class);
            User user1 = mapper.selectUserById(1);
            User user2 = mapper.selectUserById(2);
            System.out.println(user1 == user2);
        } finally {
            session.close();
        }
    }

    @Test
    public void testLocalCacheFail3() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            LocalCacheMapper mapper = session.getMapper(LocalCacheMapper.class);
            User user1 = mapper.selectUserById(1);
            System.out.println(user1);
            System.out.println("================华丽的分割线================");
            mapper.updateUserNameById(1, "美女");
            System.out.println("================华丽的分割线================");
            User user2 = mapper.selectUserById(1);
            System.out.println(user2);
            System.out.println(user1 == user2);
        } finally {
            session.close();
        }
    }

    @Test
    public void testLocalCacheFail4() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            LocalCacheMapper mapper = session.getMapper(LocalCacheMapper.class);
            User user1 = mapper.selectUserById(1);
            System.out.println(user1);
            session.clearCache();
            User user2 = mapper.selectUserById(1);
            System.out.println(user2);
            System.out.println(user1 == user2);
        } finally {
            session.close();
        }
    }

}
