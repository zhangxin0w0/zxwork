package com.itdr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdr.mapper.IndexMapper;
import com.itdr.pojo.ReplyContent;
import com.itdr.utils.SqlSessionUtil;
import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: IndexServiceImpl
 * 日期: 2019/11/4 9:42
 *
 * @author Air张
 * @since JDK 1.8
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public String getDefaultReply() {
        return indexMapper.getDefaultReply();
    }

    @Override
    public String getAutoReply() {
        return indexMapper.getAutoReply();
    }

    @Override
    public List<String> getReply(String keyword) {
        // 创建空集合用来接受数据
        List<String> li = null;

        // 参数非空判断
        if (StringUtils.isNullOrEmpty(keyword)) {
            return li;
        }


        //根据关键词获取数据
        li = indexMapper.getReplyByKeyWord(keyword);
        if (li.size() > 0) {
            return li;
        }

        //处理参数
        String words = "%" + keyword + "%";

        //根据模糊字获取数据
        li = indexMapper.getReplyByWords(words);
        if(li.size() > 0){
            return li;
        }

        //如果数据为空，返回自动回复内容
        if (li.size() == 0) {
            li.add(this.getAutoReply());
            return li;
        }

        return li;
    }

    //获取所有回复内容
    @Override
    public PageInfo getAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ReplyContent> all = indexMapper.getAll();

        PageInfo pageInfo = new PageInfo(all);
        return pageInfo;
    }

    //增加一条新数据
    @Override
    public int addOne(ReplyContent replyContent) {
        //参数非空判断

        //增加一条数据
        int i = indexMapper.addOne(replyContent);
        return i;
    }

    //删除一条数据
    @Override
    public int deleteOne(Integer id) {
        //参数非空判断

        //增加一条数据
        int i = indexMapper.deleteOne(id);
        return i;
    }
}
