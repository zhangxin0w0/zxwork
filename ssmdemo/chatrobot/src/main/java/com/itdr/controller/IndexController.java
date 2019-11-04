package com.itdr.controller;

import com.itdr.service.IndexService;
import com.itdr.service.IndexServiceImpl;

import java.util.List;

/**
 * ClassName: IndexController
 * 日期: 2019/11/4 9:41
 *
 * @author Air张
 * @since JDK 1.8
 */
public class IndexController {
    private IndexService indexService = new IndexServiceImpl();

    /**
     * 获取默认回复
     * @return
     */
    public String getDeflutReply(){
        return indexService.getDeflutReply();
    }

    /**
     * 获取自动回复
     * @return
     */
    public String getAutoReply(){
        return indexService.getAutoReply();
    }

    /**
     * 根据输入内容获取回复
     * @return
     */
    public List<String> getReply(String keyword, String words){
        return indexService.getReply(keyword,words);
    }

}
