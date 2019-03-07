package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysTask;
import com.cms.service.mapper.sys.SysTaskMapper;

@Service
public class SysTaskServiceImpl {

    @Resource
    private SysTaskMapper sysTaskMapper;

    public int insert(SysTask pojo){
        return sysTaskMapper.insert(pojo);
    }

    public int insertList(List< SysTask> pojos){
        return sysTaskMapper.insertList(pojos);
    }

    public List<SysTask> select(SysTask pojo){
        return sysTaskMapper.select(pojo);
    }

    public int update(SysTask pojo){
        return sysTaskMapper.update(pojo);
    }

}
