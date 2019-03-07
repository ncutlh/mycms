package com.cms.service.mapper.cms;


import com.cms.pojo.cms.CmsCategoryAttribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsCategoryAttributeMapper {

    int insert(@Param("pojo") CmsCategoryAttribute pojo);

    int insertList(@Param("pojos") List<CmsCategoryAttribute> pojo);

    List<CmsCategoryAttribute> select(@Param("pojo") CmsCategoryAttribute pojo);

    int update(@Param("pojo") CmsCategoryAttribute pojo);

}
