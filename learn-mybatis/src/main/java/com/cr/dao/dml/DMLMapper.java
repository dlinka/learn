package com.cr.dao.dml;

import com.cr.entity.User;

public interface DMLMapper {

    int addUser(User user);

    int addUserWithKey(User user);

    boolean updateUser(User user);

    void deleteUser(int userId);

}
