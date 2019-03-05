package com.cms.service.service.cms;

import com.publiccms.common.base.BaseService;
import com.publiccms.common.handler.PageHandler;
import com.publiccms.entities.cms.CmsCategoryType;
import com.publiccms.logic.dao.cms.CmsCategoryTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Generated 2016-2-26 15:57:04 by com.publiccms.common.source.SourceGenerator

/**
 *
 * CmsCategoryTypeService
 * 
 */
@Service
@Transactional
public class CmsCategoryTypeService extends BaseService<CmsCategoryType> {

    /**
     * @param siteId
     * @param pageIndex
     * @param pageSize
     * @return results page
     */
    @Transactional(readOnly = true)
    public PageHandler getPage(Short siteId, Integer pageIndex, Integer pageSize) {
        return dao.getPage(siteId, pageIndex, pageSize);
    }

    /**
     * @param id
     * @param extendId
     * @return result
     */
    public CmsCategoryType updateExtendId(Integer id, Integer extendId) {
        CmsCategoryType entity = getEntity(id);
        if (null != entity) {
            entity.setExtendId(extendId);
        }
        return entity;
    }

    @Autowired
    private CmsCategoryTypeDao dao;
    
}