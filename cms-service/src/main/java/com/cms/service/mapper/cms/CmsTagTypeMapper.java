package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsTagType;

public interface CmsTagTypeMapper {

    int insert(@Param("pojo") CmsTagType pojo);

    int insertList(@Param("pojos") List<CmsTagType> pojo);

    List<CmsTagType> select(@Param("pojo") CmsTagType pojo);

    int update(@Param("pojo") CmsTagType pojo);

}
