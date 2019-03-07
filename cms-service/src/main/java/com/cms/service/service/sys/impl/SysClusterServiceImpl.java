package com.cms.service.service.sys.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.sys.SysCluster;
import com.cms.service.mapper.sys.SysClusterMapper;

@Service
public class SysClusterServiceImpl {

    @Resource
    private SysClusterMapper sysClusterMapper;

    public int insert(SysCluster pojo){
        return sysClusterMapper.insert(pojo);
    }

    public int insertList(List< SysCluster> pojos){
        return sysClusterMapper.insertList(pojos);
    }

    public List<SysCluster> select(SysCluster pojo){
        return sysClusterMapper.select(pojo);
    }

    public int update(SysCluster pojo){
        return sysClusterMapper.update(pojo);
    }

}
