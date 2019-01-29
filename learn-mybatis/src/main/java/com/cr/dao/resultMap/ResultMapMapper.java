package com.cr.dao.resultMap;

import com.cr.entity.User;

public interface ResultMapMapper {

    User selectResultMap(int userId);

    User selectResultMapWithAssociation(int userId);

    User selectResultMapWithAssociationAndStep(int userId);

}
