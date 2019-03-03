package com.cr.select;

import com.cr.BaseTest;
import com.cr.dao.select.SelectMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class SelectTest extends BaseTest {

    @Test
    public void test() throws IOException {
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            SelectMapper mapper = session.getMapper(SelectMapper.class);
            System.out.println(mapper.selectUserById(1));
            System.out.println(mapper.selectUserByIdWithAnnotation(1));
            System.out.println(mapper.selectUsers());
            System.out.println(mapper.selectMapUser(1));
        } finally {
            session.close();
        }
    }

}
