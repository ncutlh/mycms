package com.cms.model;


import com.cms.entities.ExtendData;

import java.util.List;

/**
 *
 * ExtendDataParameters
 * 
 */
public class ExtendDataParameters implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    List<ExtendData> extendDataList;

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