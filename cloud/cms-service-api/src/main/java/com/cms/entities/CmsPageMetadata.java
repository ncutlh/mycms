package com.cms.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * CmsPageMetadata
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CmsPageMetadata implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String alias;
    private String publishPath;
    private boolean useDynamic;
    private boolean needLogin;
    private boolean needBody;
    private String acceptParameters;
    private Integer cacheTime;
    private String contentType;
    private List<ExtendField> extendList;

    /**
     * 
     */
    public CmsPageMetadata() {
    }

    /**
     * @return
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return
     */
    public String getPublishPath() {
        return publishPath;
    }

    /**
     * @param publishPath
     */
    public void setPublishPath(String publishPath) {
        this.publishPath = publishPath;
    }

    /**
     * @return
     */
    public boolean isNeedLogin() {
        return needLogin;
    }

    /**
     * @param needLogin
     */
    public void setNeedLogin(boolean needLogin) {
        this.needLogin = needLogin;
    }

    /**
     * @return
     */
    public String getAcceptParameters() {
        return acceptParameters;
    }

    /**
     * @param acceptParameters
     */
    public void setAcceptParameters(String acceptParameters) {
        this.acceptParameters = acceptParameters;
    }

    /**
     * @return the acceptParamters
     */
    public String getAcceptParamters() {
        return acceptParameters;
    }

    /**
     * @param acceptParameters the acceptParameters to set
     */
    public void setAcceptParamters(String acceptParameters) {
        this.acceptParameters = acceptParameters;
    }

    /**
     * @return
     */
    public Integer getCacheTime() {
        return cacheTime;
    }

    /**
     * @param cacheTime
     */
    public void setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
    }

    /**
     * @return the contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType the contentType to set
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * @return
     */
    public boolean isUseDynamic() {
        return useDynamic;
    }

    /**
     * @param useDynamic
     */
    public void setUseDynamic(boolean useDynamic) {
        this.useDynamic = useDynamic;
    }

    /**
     * @return
     */
    public boolean isNeedBody() {
        return needBody;
    }

    /**
     * @param needBody
     */
    public void setNeedBody(boolean needBody) {
        this.needBody = needBody;
    }

    /**
     * @return
     */
    public List<ExtendField> getExtendList() {
        return extendList;
    }

    /**
     * @param extendList
     */
    public void setExtendList(List<ExtendField> extendList) {
        this.extendList = extendList;
    }

    @JsonIgnore
    public Map<String, Object> getAsMap(CmsPageData data) {
        Map<String, Object> map = new HashMap<>();
        map.put("alias", getAlias());
        map.put("publishPath", getPublishPath());
        map.put("useDynamic", isUseDynamic());
        map.put("needLogin", isNeedLogin());
        map.put("needBody", isNeedBody());
        map.put("acceptParameters", getAcceptParameters());
        map.put("cacheTime", getCacheTime());
        map.put("contentType", getContentType());
        map.put("extendList", getExtendList());
        map.put("extendData", data.getExtendData());
        return map;
    }
}