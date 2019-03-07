package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsTag;

public interface CmsTagMapper {

    int insert(@Param("pojo") CmsTag pojo);

    int insertList(@Param("pojos") List<CmsTag> pojo);

    List<CmsTag> select(@Param("pojo") CmsTag pojo);

    int update(@Param("pojo") CmsTag pojo);

}
