package com.cr.dao.resultMap;

import com.cr.entity.Company;
import com.cr.entity.User;

public interface ResultMapMapper {

    User selectUser1(int userId);

    User selectUser2(int userId);

    User selectUser3(int userId);

    Company selectCompany1(int companyId);

    Company selectCompany2(int companyId);

}
