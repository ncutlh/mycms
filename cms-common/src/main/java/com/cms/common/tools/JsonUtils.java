package com.cms.common.tools;

import com.cms.common.constants.Constants;

import java.io.IOException;

/**
 * 
 * JsonUtils
 * 
 */
public final class JsonUtils {

    /**
     * @param object
     * @return json string
     */
    public static String getString(Object object) {
        try {
            return Constants.objectMapper.writeValueAsString(object);
        } catch (IOException e) {
            return null;
        }
    }
}
