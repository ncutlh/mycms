package com.cms.service.mapper.cms;



import com.cms.pojo.cms.CmsContentFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsContentFileMapper {

    int insert(@Param("pojo") CmsContentFile pojo);

    int insertList(@Param("pojos") List<CmsContentFile> pojo);

    List<CmsContentFile> select(@Param("pojo") CmsContentFile pojo);

    int update(@Param("pojo") CmsContentFile pojo);

}
