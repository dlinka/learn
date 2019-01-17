package com.cr.dao.param;

import com.cr.entity.User;

import java.util.List;
import java.util.Map;

public interface SingleParamMapper {

    User selectUserById(int userId);

    List<User> selectUserByName(String name);

    User selectUserByUser(User obj);

    User selectUserByMap(Map<String, Object> map);

    User selectUserByIds(List<Integer> ids);

}
