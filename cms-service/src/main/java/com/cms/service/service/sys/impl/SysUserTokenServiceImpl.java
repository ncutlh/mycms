package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysUserToken;
import com.cms.service.mapper.sys.SysUserTokenMapper;

@Service
public class SysUserTokenServiceImpl {

    @Resource
    private SysUserTokenMapper sysUserTokenMapper;

    public int insert(SysUserToken pojo){
        return sysUserTokenMapper.insert(pojo);
    }

    public int insertList(List< SysUserToken> pojos){
        return sysUserTokenMapper.insertList(pojos);
    }

    public List<SysUserToken> select(SysUserToken pojo){
        return sysUserTokenMapper.select(pojo);
    }

    public int update(SysUserToken pojo){
        return sysUserTokenMapper.update(pojo);
    }

}
