package com.cr.dao.resultMap;

import com.cr.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUsersByCompanyId(int companyId);

}
