package com.cms.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 *
 * ExtendData
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtendData implements java.io.Serializable {

    /**
     * 
     */
    public ExtendData() {
    }

    /**
     * @param name
     * @param value
     */
    public ExtendData(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    String name;
    String value;

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @param values
     */
//    public void setValues(String[] values) {
//        this.value = StringUtils.arrayToCommaDelimitedString(values);
//    }
}