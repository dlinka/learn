package com.cr.dao;

import com.cr.entity.Company;

public interface CompanyMapperResultMap {

    Company selectResultMapCollection(int companyId);

    Company selectResultMapCollectionWithStep(int companyId);

}
