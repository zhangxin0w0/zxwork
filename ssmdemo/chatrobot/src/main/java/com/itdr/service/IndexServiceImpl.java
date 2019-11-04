package com.itdr.service;

import com.itdr.mapper.IndexMapper;
import com.itdr.pojo.ReplyContent;
import com.itdr.utils.SqlSessionUtil;
import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * ClassName: IndexServiceImpl
 * 日期: 2019/11/4 9:42
 *
 * @author Air张
 * @since JDK 1.8
 */
public class IndexServiceImpl implements IndexService {

    private SqlSession sqlSession =  SqlSessionUtil.getSqlSessionFactory().openSession();
    private IndexMapper indexMapper =sqlSession.getMapper(IndexMapper.class);

    @Override
    public String getDeflutReply() {
        return indexMapper.getDeflutReply();
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

    @Override
    public List<ReplyContent> getAll() {
        return indexMapper.getAll();
    }

    @Override
    public int addOne(ReplyContent replyContent) {
        //参数非空判断
        int i = indexMapper.addOne(replyContent);
        sqlSession.commit();
        return i;
    }
}
