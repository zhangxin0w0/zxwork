package com.itdr.mapper;

import com.itdr.pojo.Games;

public interface GamesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Games record);

    int insertSelective(Games record);

    Games selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Games record);

    int updateByPrimaryKey(Games record);
}