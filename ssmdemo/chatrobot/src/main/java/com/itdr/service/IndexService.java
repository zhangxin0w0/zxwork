package com.itdr.service;

import com.github.pagehelper.PageInfo;
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
    String getDefaultReply();

    String getAutoReply();

    List<String> getReply(String keyword);

    PageInfo getAll(Integer pageNum,Integer pageSize);

    int addOne(ReplyContent replyContent);

    int deleteOne(Integer id);
}
