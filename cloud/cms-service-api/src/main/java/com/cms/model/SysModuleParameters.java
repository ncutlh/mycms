package com.cms.model;


import com.cms.pojo.sys.SysModuleLang;

import java.util.List;

/**
 *
 * SysConfigParameters
 * 
 */
public class SysModuleParameters implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<SysModuleLang> langList;

    /**
     * @return the langList
     */
    public List<SysModuleLang> getLangList() {
        return langList;
    }

    /**
     * @param langList
     *            the langList to set
     */
    public void setLangList(List<SysModuleLang> langList) {
        this.langList = langList;
    }

}