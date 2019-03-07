package com.cms.model;


import com.cms.pojo.sys.SysExtendField;

import java.util.List;

/**
 *
 * CmsCategoryTypeParameters
 * 
 */
public class CmsCategoryTypeParameters implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<SysExtendField> categoryExtends;

    /**
     * @return
     */
    public List<SysExtendField> getCategoryExtends() {
        return categoryExtends;
    }

    /**
     * @param categoryExtends
     */
    public void setCategoryExtends(List<SysExtendField> categoryExtends) {
        this.categoryExtends = categoryExtends;
    }
}