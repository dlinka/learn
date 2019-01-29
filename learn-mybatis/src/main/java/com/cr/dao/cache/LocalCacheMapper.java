package com.cr.dao.cache;

import com.cr.entity.User;
import org.apache.ibatis.annotations.Param;

public interface LocalCacheMapper {

    User selectUserById(int userId);

    void updateUserNameById(@Param("userId") int userId, @Param("name") String name);

}
