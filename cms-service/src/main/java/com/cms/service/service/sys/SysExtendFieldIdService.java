package com.cms.service.service.sys;



import com.cms.pojo.sys.SysExtendFieldId;

import java.util.List;
public interface  SysExtendFieldIdService {



    int insert(SysExtendFieldId pojo);

    int insertList(List< SysExtendFieldId> pojos);

    List<SysExtendFieldId> select(SysExtendFieldId pojo);

    int update(SysExtendFieldId pojo);

}
