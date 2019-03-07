package com.cms.common.tools;


import com.cms.common.constants.Constants;

import java.util.regex.Pattern;

/**
 * HtmlUtils
 * 
 */
public class HtmlUtils {

    /**
     * 
     */
    public static final Pattern HTML_PATTERN = Pattern.compile("<[^>]+>");

    /**
     * @param string
     * @return result
     */
    public static String removeHtmlTag(String string) {
        if (CommonUtils.notEmpty(string)) {
            return HTML_PATTERN.matcher(string).replaceAll(Constants.BLANK);
        }
        return string;
    }
}
