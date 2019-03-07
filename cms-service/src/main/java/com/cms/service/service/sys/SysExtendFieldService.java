package com.cms.service.service.sys;



import com.cms.pojo.sys.SysExtendField;

import java.util.List;
public interface SysExtendFieldService {



     int insert(SysExtendField pojo);

     int insertList(List< SysExtendField> pojos);

     List<SysExtendField> select(SysExtendField pojo);
     int update(SysExtendField pojo);

}
