package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: PropertiesUtil
 * 日期: 2019/12/27 10:29
 *
 * @author Air张
 * @since JDK 1.8
 */
public class PropertiesUtil {

    public static String getValue(String key) {
        Properties p = new Properties();
        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("st.properties");
        String property = null;
        try {
            p.load(in);
            property = p.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property;
    }
}
