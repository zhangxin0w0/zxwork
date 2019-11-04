package com.itdr.service;

import com.itdr.mapper.IndexMapper;
import com.itdr.utils.SqlSessionUtil;

import java.util.List;

/**
 * ClassName: IndexServiceImpl
 * 日期: 2019/11/4 9:42
 *
 * @author Air张
 * @since JDK 1.8
 */
public class IndexServiceImpl implements IndexService{

    private IndexMapper indexMapper = SqlSessionUtil.getSqlSessionFactory().openSession().getMapper(IndexMapper.class);

    @Override
    public String getDeflutReply() {
        return indexMapper.getDeflutReply();
    }

    @Override
    public String getAutoReply() {
        return indexMapper.getAutoReply();
    }

    @Override
    public List<String> getReply(String keyword, String words) {
        // 参数非空判断

        //处理参数
        String wordss = "%"+words+"%";

        //根据输入内容获取数据
        List<String> li = indexMapper.getReply(keyword, wordss);

        //如果数据为空，返回自动回复内容
        if(li.size() == 0){
            li.add(this.getAutoReply());
            return li;
        }

        return li;
    }
}
