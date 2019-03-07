package com.cms.service.mapper.cms;


import com.cms.pojo.cms.CmsCategoryModelId;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsCategoryModelIdMapper {

    int insert(@Param("pojo") CmsCategoryModelId pojo);

    int insertList(@Param("pojos") List<CmsCategoryModelId> pojo);

    List<CmsCategoryModelId> select(@Param("pojo") CmsCategoryModelId pojo);

    int update(@Param("pojo") CmsCategoryModelId pojo);

}
