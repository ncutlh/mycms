package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsDictionary;

public interface CmsDictionaryMapper {

    int insert(@Param("pojo") CmsDictionary pojo);

    int insertList(@Param("pojos") List<CmsDictionary> pojo);

    List<CmsDictionary> select(@Param("pojo") CmsDictionary pojo);

    int update(@Param("pojo") CmsDictionary pojo);

}
