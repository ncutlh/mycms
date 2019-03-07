package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsContentRelated;

public interface CmsContentRelatedMapper {

    int insert(@Param("pojo") CmsContentRelated pojo);

    int insertList(@Param("pojos") List<CmsContentRelated> pojo);

    List<CmsContentRelated> select(@Param("pojo") CmsContentRelated pojo);

    int update(@Param("pojo") CmsContentRelated pojo);

}
