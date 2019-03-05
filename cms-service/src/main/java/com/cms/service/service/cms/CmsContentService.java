package com.cms.service.service.cms;

import com.publiccms.common.base.BaseService;
import com.publiccms.common.constants.CommonConstants;
import com.publiccms.common.handler.FacetPageHandler;
import com.publiccms.common.handler.PageHandler;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.common.tools.ExtendUtils;
import com.publiccms.entities.cms.CmsCategory;
import com.publiccms.entities.cms.CmsContent;
import com.publiccms.entities.cms.CmsContentAttribute;
import com.publiccms.entities.sys.SysExtendField;
import com.publiccms.entities.sys.SysUser;
import com.publiccms.logic.dao.cms.CmsCategoryDao;
import com.publiccms.logic.dao.cms.CmsContentDao;
import com.publiccms.logic.service.sys.SysExtendFieldService;
import com.publiccms.logic.service.sys.SysExtendService;
import com.publiccms.views.pojo.entities.CmsContentStatistics;
import com.publiccms.views.pojo.entities.CmsModel;
import com.publiccms.views.pojo.entities.ExtendField;
import com.publiccms.views.pojo.model.CmsContentParameters;
import com.publiccms.views.pojo.query.CmsContentQuery;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.Future;

import static org.springframework.util.StringUtils.arrayToDelimitedString;

/**
 *
 * CmsContentService
 * 
 */
@Service
@Transactional
public class CmsContentService extends BaseService<CmsContent> {
    @Autowired
    private SysExtendService extendService;
    @Autowired
    private SysExtendFieldService extendFieldService;
    @Autowired
    private CmsTagService tagService;
    @Autowired
    private CmsContentFileService contentFileService;
    @Autowired
    private CmsContentAttributeService attributeService;
    @Autowired
    private CmsContentRelatedService cmsContentRelatedService;
    /**
     * 
     */
    public static final int STATUS_DRAFT = 0;
    /**
     * 
     */
    public static final int STATUS_NORMAL = 1;
    /**
     * 
     */
    public static final int STATUS_PEND = 2;

    /**
     * @param projection
     * @param siteId
     * @param text
     * @param tagIds
     * @param categoryId
     * @param containChild
     * @param categoryIds
     * @param modelIds
     * @param startPublishDate
     * @param endPublishDate
     * @param orderField
     * @param pageIndex
     * @param pageSize
     * @return results page
     */
    @Transactional(readOnly = true)
    public PageHandler query(boolean projection, Short siteId, String text, Long[] tagIds, Integer categoryId,
            Boolean containChild, Integer[] categoryIds, String[] modelIds, Date startPublishDate, Date endPublishDate,
            String orderField, Integer pageIndex, Integer pageSize) {
        return dao.query(projection, siteId, text, arrayToDelimitedString(tagIds, CommonConstants.BLANK_SPACE),
                getCategoryIds(containChild, categoryId, categoryIds), modelIds, startPublishDate, endPublishDate, orderField,
                pageIndex, pageSize);
    }

    /**
     * @param siteId
     * @param categoryIds
     * @param modelIds
     * @param text
     * @param tagIds
     * @param startPublishDate
     * @param endPublishDate
     * @param orderField 
     * @param pageIndex
     * @param pageSize
     * @return results page
     */
    @Transactional(readOnly = true)
    public FacetPageHandler facetQuery(Short siteId, String[] categoryIds, String[] modelIds, String text, Long[] tagIds,
            Date startPublishDate, Date endPublishDate, String orderField, Integer pageIndex, Integer pageSize) {
        return dao.facetQuery(siteId, categoryIds, modelIds, text, arrayToDelimitedString(tagIds, CommonConstants.BLANK_SPACE),
                startPublishDate, endPublishDate, orderField, pageIndex, pageSize);
    }

    /**
     * @param siteId
     * @param ids
     */
    public void index(short siteId, Serializable[] ids) {
        dao.index(siteId, ids);
    }

    /**
     * @return results page
     */
    public Future<?> reCreateIndex() {
        return dao.reCreateIndex();
    }

    /**
     * @param queryEntity
     * @param containChild
     * @param orderField
     * @param orderType
     * @param pageIndex
     * @param pageSize
     * @return results page
     */
    @Transactional(readOnly = true)
    public PageHandler getPage(CmsContentQuery queryEntity, Boolean containChild, String orderField, String orderType,
            Integer pageIndex, Integer pageSize) {
        queryEntity.setCategoryIds(getCategoryIds(containChild, queryEntity.getCategoryId(), queryEntity.getCategoryIds()));
        return dao.getPage(queryEntity, orderField, orderType, pageIndex, pageSize);
    }

    public void saveTagAndAttribute(Short siteId, Long userId, Long id, CmsContentParameters contentParameters, CmsModel cmsModel,
            CmsCategory category, CmsContentAttribute attribute) {
        Long[] tagIds = tagService.update(siteId, contentParameters.getTags());
        CmsContent entity = getEntity(id);
        if (null != entity) {
            entity.setTagIds(arrayToDelimitedString(tagIds, CommonConstants.BLANK_SPACE));
        }
        if (entity.isHasImages() || entity.isHasFiles()) {
            contentFileService.update(entity.getId(), userId, entity.isHasFiles() ? contentParameters.getFiles() : null,
                    entity.isHasImages() ? contentParameters.getImages() : null);// 更新保存图集，附件
        }

        List<ExtendField> modelExtendList = cmsModel.getExtendList();
        Map<String, String> map = ExtendUtils.getExtentDataMap(contentParameters.getModelExtendDataList(), modelExtendList);
        if (null != category && null != extendService.getEntity(category.getExtendId())) {
            List<SysExtendField> categoryExtendList = extendFieldService.getList(category.getExtendId());
            Map<String, String> categoryMap = ExtendUtils.getSysExtentDataMap(contentParameters.getCategoryExtendDataList(),
                    categoryExtendList);
            if (CommonUtils.notEmpty(map)) {
                map.putAll(categoryMap);
            } else {
                map = categoryMap;
            }
        }

        if (CommonUtils.notEmpty(map)) {
            attribute.setData(ExtendUtils.getExtendString(map));
        } else {
            attribute.setData(null);
        }

        attributeService.updateAttribute(id, attribute);// 更新保存扩展字段，文本字段
        if (CommonUtils.notEmpty(contentParameters.getContentRelateds())) {
            cmsContentRelatedService.update(id, userId, contentParameters.getContentRelateds());// 更新保存推荐内容
        }
    }

    /**
     * @param siteId
     * @param user
     * @param ids
     * @return results list
     */
    public List<CmsContent> refresh(short siteId, SysUser user, Serializable[] ids) {
        List<CmsContent> entityList = new ArrayList<>();
        List<CmsContent> list = getEntitys(ids);
        Collections.reverse(list);
        for (CmsContent entity : list) {
            if (null != entity && STATUS_NORMAL == entity.getStatus() && siteId == entity.getSiteId()
                    && (user.isOwnsAllContent() || entity.getUserId() == user.getId())) {
                Date now = CommonUtils.getDate();
                if (now.after(entity.getPublishDate())) {
                    entity.setPublishDate(now);
                    entityList.add(entity);
                }
            }
        }
        return entityList;
    }

    /**
     * @param siteId
     * @param user
     * @param ids
     * @return results list
     */
    public List<CmsContent> check(short siteId, SysUser user, Serializable[] ids) {
        List<CmsContent> entityList = new ArrayList<>();
        for (CmsContent entity : getEntitys(ids)) {
            if (null != entity && siteId == entity.getSiteId() && STATUS_PEND == entity.getStatus()
                    && (user.isOwnsAllContent() || entity.getUserId() == user.getId())) {
                entity.setStatus(STATUS_NORMAL);
                entity.setCheckUserId(user.getId());
                entity.setCheckDate(CommonUtils.getDate());
                entityList.add(entity);
            }
        }
        return entityList;
    }

    /**
     * @param siteId
     * @param user
     * @param ids
     * @return results list
     */
    public List<CmsContent> uncheck(short siteId, SysUser user, Serializable[] ids) {
        List<CmsContent> entityList = new ArrayList<>();
        for (CmsContent entity : getEntitys(ids)) {
            if (null != entity && siteId == entity.getSiteId() && STATUS_NORMAL == entity.getStatus()
                    && (user.isOwnsAllContent() || entity.getUserId() == user.getId())) {
                entity.setStatus(STATUS_PEND);
                entityList.add(entity);
            }
        }
        return entityList;
    }

    /**
     * @param entitys
     */
    public void updateStatistics(Collection<CmsContentStatistics> entitys) {
        for (CmsContentStatistics entityStatistics : entitys) {
            CmsContent entity = getEntity(entityStatistics.getId());
            if (null != entity) {
                entity.setClicks(entity.getClicks() + entityStatistics.getClicks());
                entity.setComments(entity.getComments() + entityStatistics.getComments());
                entity.setScores(entity.getScores() + entityStatistics.getScores());
            }
        }
    }

    /**
     * @param siteId
     * @param id
     * @param categoryId
     * @return result
     */
    public CmsContent updateCategoryId(short siteId, Serializable id, int categoryId) {
        CmsContent entity = getEntity(id);
        if (null != entity && siteId == entity.getSiteId()) {
            entity.setCategoryId(categoryId);
        }
        return entity;
    }

    /**
     * @param id
     * @param num
     * @return result
     */
    public CmsContent updateChilds(Serializable id, int num) {
        CmsContent entity = getEntity(id);
        if (null != entity) {
            entity.setChilds(entity.getChilds() + num);
        }
        return entity;
    }

    /**
     * @param id
     * @param modelId
     */
    public void changeModel(Serializable id, String modelId) {
        CmsContent entity = getEntity(id);
        if (null != entity) {
            entity.setModelId(modelId);
        }
    }

    /**
     * @param siteId
     * @param id
     * @param sort
     * @return result
     */
    public CmsContent sort(Short siteId, Long id, int sort) {
        CmsContent entity = getEntity(id);
        if (null != entity && siteId == entity.getSiteId()) {
            entity.setSort(sort);
        }
        return entity;
    }

    /**
     * @param id
     * @param url
     * @param hasStatic
     * @return result
     */
    public CmsContent updateUrl(Serializable id, String url, boolean hasStatic) {
        CmsContent entity = getEntity(id);
        if (null != entity) {
            entity.setUrl(url);
            entity.setHasStatic(hasStatic);
        }
        return entity;
    }

    /**
     * @param siteId
     * @param categoryIds
     * @return number of data deleted
     */
    public int deleteByCategoryIds(short siteId, Integer[] categoryIds) {
        return dao.deleteByCategoryIds(siteId, categoryIds);
    }

    /**
     * @param siteId
     * @param user
     * @param ids
     * @return list of data deleted
     */
    @SuppressWarnings("unchecked")
    public List<CmsContent> delete(short siteId, SysUser user, Serializable[] ids) {
        List<CmsContent> entityList = new ArrayList<>();
        for (CmsContent entity : getEntitys(ids)) {
            if (siteId == entity.getSiteId() && !entity.isDisabled()
                    && (user.isOwnsAllContent() || entity.getUserId() == user.getId())) {
                if (0 < entity.getChilds()) {
                    for (CmsContent child : (List<CmsContent>) getPage(new CmsContentQuery(siteId, null, null, null, null, null,
                            entity.getId(), null, null, null, null, null, null, null, null, null), null, null, null, null, null)
                                    .getList()) {
                        child.setDisabled(true);
                        entity.setChilds(entity.getChilds() - 1);
                    }
                }
                entity.setDisabled(true);
                entityList.add(entity);
            }
        }
        return entityList;
    }

    private Integer[] getCategoryIds(Boolean containChild, Integer categoryId, Integer[] categoryIds) {
        if (CommonUtils.empty(categoryId)) {
            return categoryIds;
        } else if (null != containChild && containChild) {
            CmsCategory category = categoryDao.getEntity(categoryId);
            if (null != category && CommonUtils.notEmpty(category.getChildIds())) {
                String[] categoryStringIds = ArrayUtils.add(
                        StringUtils.splitByWholeSeparator(category.getChildIds(), CommonConstants.COMMA_DELIMITED),
                        String.valueOf(categoryId));
                categoryIds = new Integer[categoryStringIds.length + 1];
                for (int i = 0; i < categoryStringIds.length; i++) {
                    categoryIds[i] = Integer.parseInt(categoryStringIds[i]);
                }
                categoryIds[categoryStringIds.length] = categoryId;
            }
        } else {
            categoryIds = new Integer[] { categoryId };
        }
        return categoryIds;
    }

    /**
     * @param siteId
     * @param ids
     * @return list of data deleted
     */
    @SuppressWarnings("unchecked")
    public List<CmsContent> recycle(short siteId, Serializable[] ids) {
        List<CmsContent> entityList = new ArrayList<>();
        for (CmsContent entity : getEntitys(ids)) {
            if (siteId == entity.getSiteId() && entity.isDisabled()) {
                if (0 < entity.getChilds()) {
                    for (CmsContent child : (List<CmsContent>) getPage(new CmsContentQuery(siteId, null, null, null, null, null,
                            entity.getId(), null, null, null, null, null, null, null, null, null), false, null, null, null, null)
                                    .getList()) {
                        child.setDisabled(false);
                        entityList.add(child);
                    }
                }
                entity.setDisabled(false);
                entityList.add(entity);
            }
        }
        return entityList;
    }

    /**
     * @param siteId
     * @param ids
     * @return list of data deleted
     */
    @SuppressWarnings("unchecked")
    public List<CmsContent> realDelete(Short siteId, Long[] ids) {
        List<CmsContent> entityList = new ArrayList<>();
        for (CmsContent entity : getEntitys(ids)) {
            if (siteId == entity.getSiteId() && entity.isDisabled()) {
                if (0 < entity.getChilds()) {
                    for (CmsContent child : (List<CmsContent>) getPage(new CmsContentQuery(siteId, null, null, null, null, null,
                            entity.getId(), null, null, null, null, null, null, null, null, null), false, null, null, null, null)
                                    .getList()) {
                        delete(child.getId());
                    }
                }
                delete(entity.getId());
            }
        }
        return entityList;
    }

    @Autowired
    private CmsContentDao dao;
    @Autowired
    private CmsCategoryDao categoryDao;
}