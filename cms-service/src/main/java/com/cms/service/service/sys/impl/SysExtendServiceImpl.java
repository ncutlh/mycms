package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysExtend;
import com.cms.service.mapper.sys.SysExtendMapper;

@Service
public class SysExtendServiceImpl {

    @Resource
    private SysExtendMapper sysExtendMapper;

    public int insert(SysExtend pojo){
        return sysExtendMapper.insert(pojo);
    }

    public int insertList(List< SysExtend> pojos){
        return sysExtendMapper.insertList(pojos);
    }

    public List<SysExtend> select(SysExtend pojo){
        return sysExtendMapper.select(pojo);
    }

    public int update(SysExtend pojo){
        return sysExtendMapper.update(pojo);
    }

}
