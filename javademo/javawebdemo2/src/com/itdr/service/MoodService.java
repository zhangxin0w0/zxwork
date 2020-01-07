package com.itdr.service;

import com.itdr.pojo.Mood;

/**
 * ClassName: MoodService
 * 日期: 2020/1/7 19:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface MoodService {
    Mood selectMood(String id);
}
