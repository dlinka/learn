package com.cr.dao;

import com.cr.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User selectUserById(int userId);

    List<User> selectUserByCompanyId(int companyId);

    Map<String, Object> selectMapUser(int userId);

    List<User> selectUsers();

    @MapKey("userId")
    Map<Integer, User> selectMapUsers();

    @Select("select name from User where user_id = #{userId}")
    String selectUserName(int userId);

    int addUser(User user);

    boolean updateUser(User user);

    boolean updateUserNickName(@Param("userId") int userId, @Param("nickName") String nickName);

    void deleteUser(int userId);

}
