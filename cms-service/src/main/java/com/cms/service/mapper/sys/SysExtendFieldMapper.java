package com.cms.service.mapper.sys;



import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.cms.pojo.sys.SysExtendField;

public interface SysExtendFieldMapper {

    int insert(@Param("pojo") SysExtendField pojo);

    int insertList(@Param("pojos") List<SysExtendField> pojo);

    List<SysExtendField> select(@Param("pojo") SysExtendField pojo);

    int update(@Param("pojo") SysExtendField pojo);

}
