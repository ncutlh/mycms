package com.cms.model;


import com.cms.entities.ExtendData;

import java.util.List;

/**
 *
 * SysConfigParameters
 * 
 */
public class SysConfigParameters implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<ExtendData> extendDataList;

    /**
     * @return
     */
    public List<ExtendData> getExtendDataList() {
        return extendDataList;
    }

    /**
     * @param extendDataList
     */
    public void setExtendDataList(List<ExtendData> extendDataList) {
        this.extendDataList = extendDataList;
    }

}