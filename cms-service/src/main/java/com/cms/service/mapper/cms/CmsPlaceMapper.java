package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsPlace;

public interface CmsPlaceMapper {

    int insert(@Param("pojo") CmsPlace pojo);

    int insertList(@Param("pojos") List<CmsPlace> pojo);

    List<CmsPlace> select(@Param("pojo") CmsPlace pojo);

    int update(@Param("pojo") CmsPlace pojo);

}
