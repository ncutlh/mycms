package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsContent;

public interface CmsContentMapper {

    int insert(@Param("pojo") CmsContent pojo);

    int insertList(@Param("pojos") List<CmsContent> pojo);

    List<CmsContent> select(@Param("pojo") CmsContent pojo);

    int update(@Param("pojo") CmsContent pojo);

}
