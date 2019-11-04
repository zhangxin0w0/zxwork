package com.itdr.service;

import com.itdr.pojo.ReplyContent;

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

    List<String> getReply(String keyword);

    List<ReplyContent> getAll();

    int addOne(ReplyContent replyContent);
}
