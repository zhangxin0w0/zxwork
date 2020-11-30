package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.mapper.DJMapper;
import com.itdr.pojo.DJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName: DJServiceImpl
 * 日期: 2020/11/9 17:12
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class DJServiceImpl implements DJService{
    @Autowired
    DJMapper djMapper;

    @Override
    public ServerResponse sj(Integer num) {
        Set<Integer> s = new HashSet();
        List<DJ> djl = new ArrayList<>();
        // 1.查询当前数据库中有多少种道具
        List<DJ> djList = djMapper.selectAll();
        // 2.产生num个随机数，做为道具ID
        int size = djList.size();
        while (s.size()<=num){
            long round = Math.round(Math.random() * size);
            s.add((int) round);
        }
        // 3.根据道具ID查询道具数据
        for (Integer did : s) {
            DJ dj = djMapper.selectById(did);
            if(dj != null){
                djl.add(dj);
            }
        }

        return ServerResponse.toSuccess(djl);

    }
}
