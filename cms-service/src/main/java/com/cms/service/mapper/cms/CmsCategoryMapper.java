package com.cms.service.mapper.cms;


import com.cms.pojo.cms.CmsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsCategoryMapper {

    int insert(@Param("pojo") CmsCategory pojo);

    int insertList(@Param("pojos") List<CmsCategory> pojo);

    List<CmsCategory> select(@Param("pojo") CmsCategory pojo);

    int update(@Param("pojo") CmsCategory pojo);

    CmsCategory selectById(@Param("id") Integer id);

}
