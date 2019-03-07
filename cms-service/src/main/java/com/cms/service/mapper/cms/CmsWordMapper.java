package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsWord;

public interface CmsWordMapper {

    int insert(@Param("pojo") CmsWord pojo);

    int insertList(@Param("pojos") List<CmsWord> pojo);

    List<CmsWord> select(@Param("pojo") CmsWord pojo);

    int update(@Param("pojo") CmsWord pojo);

}
