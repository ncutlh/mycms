package com.cms.service.mapper.cms;



import com.cms.pojo.cms.CmsDictionaryDataId;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsDictionaryDataIdMapper {

    int insert(@Param("pojo") CmsDictionaryDataId pojo);

    int insertList(@Param("pojos") List<CmsDictionaryDataId> pojo);

    List<CmsDictionaryDataId> select(@Param("pojo") CmsDictionaryDataId pojo);

    int update(@Param("pojo") CmsDictionaryDataId pojo);

}
