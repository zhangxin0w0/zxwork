package com.itdr.service;

import com.itdr.mapper.ReplyContentMapper;
import com.itdr.pojo.ReplyContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: ReplyContentServiceImpl
 * 日期: 2019/11/11 10:46
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class ReplyContentServiceImpl implements ReplyContentService{

    @Autowired
    ReplyContentMapper replyContentMapper;

    @Override
    public ReplyContent getOne(Integer id) {
        ReplyContent replyContent = replyContentMapper.selectByPrimaryKey(id);
        return replyContent;
    }
}
