package com.cms.model;


import com.cms.pojo.cms.CmsDictionaryData;

import java.util.List;

/**
 *
 * CmsDictionaryParameters
 * 
 */
public class CmsDictionaryParameters implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<CmsDictionaryData> dataList;

    /**
     * @return the dataList
     */
    public List<CmsDictionaryData> getDataList() {
        return dataList;
    }

    /**
     * @param dataList
     *            the dataList to set
     */
    public void setDataList(List<CmsDictionaryData> dataList) {
        this.dataList = dataList;
    }

}