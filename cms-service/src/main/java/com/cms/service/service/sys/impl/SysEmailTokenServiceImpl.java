package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysEmailToken;
import com.cms.service.mapper.sys.SysEmailTokenMapper;

@Service
public class SysEmailTokenServiceImpl {

    @Resource
    private SysEmailTokenMapper sysEmailTokenMapper;

    public int insert(SysEmailToken pojo){
        return sysEmailTokenMapper.insert(pojo);
    }

    public int insertList(List< SysEmailToken> pojos){
        return sysEmailTokenMapper.insertList(pojos);
    }

    public List<SysEmailToken> select(SysEmailToken pojo){
        return sysEmailTokenMapper.select(pojo);
    }

    public int update(SysEmailToken pojo){
        return sysEmailTokenMapper.update(pojo);
    }

}
