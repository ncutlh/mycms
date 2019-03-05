package com.cms.service.service.cms;

import com.publiccms.common.base.BaseService;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.entities.cms.CmsPlaceAttribute;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * CmsPlaceAttributeService
 * 
 */
@Service
@Transactional
public class CmsPlaceAttributeService extends BaseService<CmsPlaceAttribute> {

    /**
     * @param placeId
     * @param data
     */
    public void updateAttribute(Long placeId, String data) {
        CmsPlaceAttribute attribute = getEntity(placeId);
        if (null != attribute) {
            attribute.setData(data);
        } else {
            if (CommonUtils.notEmpty(placeId)) {
                save(new CmsPlaceAttribute(placeId, data));
            }
        }
    }
}