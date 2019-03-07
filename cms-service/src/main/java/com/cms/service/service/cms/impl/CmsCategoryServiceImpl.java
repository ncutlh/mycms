package com.cms.service.service.cms.impl;

import com.cms.pojo.cms.CmsCategory;
import com.cms.service.mapper.cms.CmsCategoryMapper;
import com.cms.service.service.cms.CmsCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
 * CmsCategoryService
 *
 */
@Service
@Transactional
public class CmsCategoryServiceImpl  implements CmsCategoryService {


    @Resource
    private CmsCategoryMapper cmsCategoryMapper;

    @Override
    public CmsCategory getById(Integer id) {
        return cmsCategoryMapper.selectById(id);
    }
}
