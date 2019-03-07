package com.cms.service.service.cms.impl;



import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.cms.pojo.cms.CmsContentFile;
import com.cms.service.mapper.cms.CmsContentFileMapper;

@Service
public class CmsContentFileServiceImpl {

    @Resource
    private CmsContentFileMapper cmsContentFileMapper;

    public int insert(CmsContentFile pojo){
        return cmsContentFileMapper.insert(pojo);
    }

    public int insertList(List< CmsContentFile> pojos){
        return cmsContentFileMapper.insertList(pojos);
    }

    public List<CmsContentFile> select(CmsContentFile pojo){
        return cmsContentFileMapper.select(pojo);
    }

    public int update(CmsContentFile pojo){
        return cmsContentFileMapper.update(pojo);
    }

}
