package com.cr.dao.cache;

import com.cr.entity.User;

public interface SecondLevelCacheMapper {

    User selectUserById(int userId);

}
