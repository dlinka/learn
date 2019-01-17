package com.cr.dao.param;

import com.cr.entity.Company;
import com.cr.entity.User;

public interface MultiParamMapper {

    User selectUser1(int userId, String name);

    User selectUser2(int userId, Company company);

}
