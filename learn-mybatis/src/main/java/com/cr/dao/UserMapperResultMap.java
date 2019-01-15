package com.cr.dao;

import com.cr.entity.User;

public interface UserMapperResultMap {

    User selectResultMapAssociation(int userId);

    User selectResultMapAssociationWithStep(int userId);

}
