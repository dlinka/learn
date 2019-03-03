package com.cr.dao.select;

import com.cr.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface SelectMapper {

    User selectUserById(int userId);

    @Select("select * from User where user_id = #{userId}")
    User selectUserByIdWithAnnotation(int userId);

    List<User> selectUsers();

    Map<String, Object> selectMapUser(int userId);

}
