package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsPlaceAttribute;

public interface CmsPlaceAttributeMapper {

    int insert(@Param("pojo") CmsPlaceAttribute pojo);

    int insertList(@Param("pojos") List<CmsPlaceAttribute> pojo);

    List<CmsPlaceAttribute> select(@Param("pojo") CmsPlaceAttribute pojo);

    int update(@Param("pojo") CmsPlaceAttribute pojo);

}
