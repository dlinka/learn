package com.cr.dao.param;

import com.cr.entity.Company;
import com.cr.entity.User;

import java.util.List;

public interface MultiParamMapper {

    User selectUser1(int userId, String name);

    User selectUser2(int userId, Company company);

    User selectUser3(List<Integer> userIds, String name);

}
