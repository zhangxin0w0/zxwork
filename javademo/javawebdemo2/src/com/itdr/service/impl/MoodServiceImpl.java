package com.itdr.service.impl;

import com.itdr.dao.MoodDao;
import com.itdr.pojo.Mood;
import com.itdr.service.MoodService;

/**
 * ClassName: MoodServiceImpl
 * 日期: 2020/1/7 19:29
 *
 * @author Air张
 * @since JDK 1.8
 */
public class MoodServiceImpl implements MoodService {

    private MoodDao md = new MoodDao();

    @Override
    public Mood selectMood(String id) {
        if (id == null || "".equals(id)) {
            return null;
        }

        Mood m = null;

        //需要判断字符串是不是纯数字
        try {
            int i = Integer.parseInt(id);
            m = md.selectById(i);
        } catch (Exception e) {
            return null;
        }

        return m;
    }
}
