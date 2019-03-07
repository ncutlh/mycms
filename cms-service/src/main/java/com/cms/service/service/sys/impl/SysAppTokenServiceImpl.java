package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysAppToken;
import com.cms.service.mapper.sys.SysAppTokenMapper;

@Service
public class SysAppTokenServiceImpl {

    @Resource
    private SysAppTokenMapper sysAppTokenMapper;

    public int insert(SysAppToken pojo){
        return sysAppTokenMapper.insert(pojo);
    }

    public int insertList(List< SysAppToken> pojos){
        return sysAppTokenMapper.insertList(pojos);
    }

    public List<SysAppToken> select(SysAppToken pojo){
        return sysAppTokenMapper.select(pojo);
    }

    public int update(SysAppToken pojo){
        return sysAppTokenMapper.update(pojo);
    }

}
