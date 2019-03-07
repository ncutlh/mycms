package com.cms.service.mapper.cms;


import com.cms.pojo.cms.CmsCategoryType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsCategoryTypeMapper {

    int insert(@Param("pojo") CmsCategoryType pojo);

    int insertList(@Param("pojos") List<CmsCategoryType> pojo);

    List<CmsCategoryType> select(@Param("pojo") CmsCategoryType pojo);

    int update(@Param("pojo") CmsCategoryType pojo);

}
