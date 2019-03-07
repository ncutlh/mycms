package com.cms.service.service.sys;



import com.cms.pojo.sys.SysEmailToken;

import java.util.List;
public interface SysEmailTokenService {



     int insert(SysEmailToken pojo);

     int insertList(List< SysEmailToken> pojos);

     List<SysEmailToken> select(SysEmailToken pojo);

     int update(SysEmailToken pojo);

}
