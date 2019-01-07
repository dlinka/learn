package com.cr.dao;

import com.cr.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    User selectUser(int uid);

    @Select("select name from User where id = #{id}")
    String selectUserName(int uid);

    int addUser(User user);

    boolean updateUser(User user);

    boolean updateUserNickName(@Param("uid") int uid, @Param("nickName") String nickName);

    void deleteUser(int uid);

}
