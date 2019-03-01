package com.cr.dao.param;

import com.cr.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SingleParamUseAnnotationMapper {

    User selectUserById(@Param("userId") int userId);

    User selectUserByUser(@Param("user") User user);

    User selectUserByMap(@Param("map") Map<String, Object> map);

    User selectUserByIds(@Param("userIds") List<Integer> userIds);

}
