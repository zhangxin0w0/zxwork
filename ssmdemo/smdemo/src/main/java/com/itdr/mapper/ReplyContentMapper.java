package com.itdr.mapper;

import com.itdr.pojo.ReplyContent;

public interface ReplyContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReplyContent record);

    int insertSelective(ReplyContent record);

    ReplyContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReplyContent record);

    int updateByPrimaryKey(ReplyContent record);
}