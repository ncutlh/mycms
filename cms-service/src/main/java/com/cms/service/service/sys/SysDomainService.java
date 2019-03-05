package com.cms.service.service.sys;

import com.publiccms.common.base.BaseService;
import com.publiccms.common.handler.PageHandler;
import com.publiccms.entities.sys.SysDomain;
import com.publiccms.logic.dao.sys.SysDomainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

// Generated 2015-7-3 16:18:22 by com.publiccms.common.source.SourceGenerator

/**
 *
 * SysDomainService
 * 
 */
@Service
@Transactional
public class SysDomainService extends BaseService<SysDomain> {

    /**
     * @param siteId
     * @param wild
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Transactional(readOnly = true)
    public PageHandler getPage(Short siteId, Boolean wild, Integer pageIndex, Integer pageSize) {
        return dao.getPage(siteId, wild, pageIndex, pageSize);
    }

    @Override
    public SysDomain update(Serializable id, SysDomain newEntity) {
        delete(id);
        save(newEntity);
        return newEntity;
    }

    @Autowired
    private SysDomainDao dao;
    
}