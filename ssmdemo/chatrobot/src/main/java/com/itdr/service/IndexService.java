package com.itdr.service;

import java.util.List;

/**
 * ClassName: IndexService
 * 日期: 2019/11/4 9:42
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface IndexService {
    String getDeflutReply();

    String getAutoReply();

    List<String> getReply(String keyword, String words);
}
