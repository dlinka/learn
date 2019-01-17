package com.cr.dao.param;

import com.cr.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SingleParamUseAnnotationMapper {

    User selectUserById(@Param("userId") int userId);

    List<User> selectUserByName(@Param("name") String name);

    User selectUserByUser(@Param("obj") User obj);

    User selectUserByMap(@Param("map") Map<String, Object> map);

    User selectUserByIds(@Param("ids") List<Integer> ids);

}
