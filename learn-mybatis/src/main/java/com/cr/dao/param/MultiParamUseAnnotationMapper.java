package com.cr.dao.param;

import com.cr.entity.Company;
import com.cr.entity.User;
import org.apache.ibatis.annotations.Param;

public interface MultiParamUseAnnotationMapper {

    User selectUser1(@Param("userId") int userId, String name);

    User selectUser2(int userId, @Param("company") Company company);

    User selectUser3(@Param("userId") int userId, @Param("company") Company company);

}
