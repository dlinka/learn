package com.cr.dml;

import com.cr.BaseTest;
import com.cr.dao.dml.DMLMapper;
import com.cr.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class DMLTest extends BaseTest{

    @Test
    public void testAdd() throws Exception {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            DMLMapper mapper = session.getMapper(DMLMapper.class);
            System.out.println(mapper.addUser(new User(null, "daughter", "白菜")));
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void testAddWithKey() throws Exception {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            DMLMapper mapper = session.getMapper(DMLMapper.class);
            User user = new User(null, "women", "女人");
            mapper.addUserWithKey(user);
            System.out.println(user.getUserId());
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void testUpdate() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            DMLMapper mapper = session.getMapper(DMLMapper.class);
            System.out.println(mapper.updateUser(new User(6, "model", "模特")));
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void testDelete() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession(true);
        try {
            DMLMapper mapper = session.getMapper(DMLMapper.class);
            mapper.deleteUser(6);
        } finally {
            session.close();
        }
    }

}
