package com.cms.service.mapper.cms;


import com.cms.pojo.cms.CmsContentAttribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsContentAttributeMapper {

    int insert(@Param("pojo") CmsContentAttribute pojo);

    int insertList(@Param("pojos") List<CmsContentAttribute> pojo);

    List<CmsContentAttribute> select(@Param("pojo") CmsContentAttribute pojo);

    int update(@Param("pojo") CmsContentAttribute pojo);

}
