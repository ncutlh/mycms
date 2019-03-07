package com.cms.pojo.cms;

import lombok.Data;

/**
 * CmsContentFiles generated by hbm2java
 */

//@Table(name = "cms_content_file")
@Data
public class CmsContentFile implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
   //@GeneratorColumn(title = "ID")
    private Long id;
   //@GeneratorColumn(title = "内容", condition = true)
    private long contentId;
   //@GeneratorColumn(title = "上传用户", condition = true)
    private long userId;
   //@GeneratorColumn(title = "文件路径")
    private String filePath;
   //@GeneratorColumn(title = "是否图片", condition = true)
    private boolean image;
   //@GeneratorColumn(title = "大小", order = true)
    private int size;
   //@GeneratorColumn(title = "点击", order = true)
    private int clicks;
   //@GeneratorColumn(title = "排序")
    private int sort;
   //@GeneratorColumn(title = "描述")
    private String description;

    public CmsContentFile() {
    }

    public CmsContentFile(long contentId, long userId, String filePath, boolean image, int size, int clicks, int sort) {
        this.contentId = contentId;
        this.userId = userId;
        this.filePath = filePath;
        this.image = image;
        this.size = size;
        this.clicks = clicks;
        this.sort = sort;
    }

    public CmsContentFile(long contentId, long userId, String filePath, boolean image, int size, int clicks, int sort,
            String description) {
        this.contentId = contentId;
        this.userId = userId;
        this.filePath = filePath;
        this.image = image;
        this.size = size;
        this.clicks = clicks;
        this.sort = sort;
        this.description = description;
    }


}
