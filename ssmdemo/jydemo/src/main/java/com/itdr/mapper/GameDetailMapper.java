package com.itdr.mapper;

import com.itdr.pojo.GameDetail;

public interface GameDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GameDetail record);

    int insertSelective(GameDetail record);

    GameDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GameDetail record);

    int updateByPrimaryKey(GameDetail record);
}