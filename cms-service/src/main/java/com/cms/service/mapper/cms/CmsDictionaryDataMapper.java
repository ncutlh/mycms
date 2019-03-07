package com.cms.service.mapper.cms;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.cms.CmsDictionaryData;

public interface CmsDictionaryDataMapper {

    int insert(@Param("pojo") CmsDictionaryData pojo);

    int insertList(@Param("pojos") List<CmsDictionaryData> pojo);

    List<CmsDictionaryData> select(@Param("pojo") CmsDictionaryData pojo);

    int update(@Param("pojo") CmsDictionaryData pojo);

}
