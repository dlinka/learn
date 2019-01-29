package com.cr.dao.resultMap;

import com.cr.entity.Company;

public interface ResultMapCollectionMapper {

    Company selectResultMapCollection(int companyId);

    Company selectResultMapCollectionWithStep(int companyId);

}
