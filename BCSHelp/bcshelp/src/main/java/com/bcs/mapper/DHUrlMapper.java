package com.bcs.mapper;

import com.bcs.pojo.DHUrl;

public interface DHUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DHUrl record);

    int insertSelective(DHUrl record);

    DHUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DHUrl record);

    int updateByPrimaryKey(DHUrl record);
}