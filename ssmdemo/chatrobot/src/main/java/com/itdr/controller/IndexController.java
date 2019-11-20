package com.itdr.controller;

import com.github.pagehelper.PageInfo;
import com.itdr.pojo.ReplyContent;
import com.itdr.service.IndexService;
import com.itdr.service.IndexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * ClassName: IndexController
 * 日期: 2019/11/4 9:41
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/index/")
public class IndexController {

    @Autowired
    private IndexService indexService;


//    ===========前台需求===============

    /**
     * 获取默认回复
     *
     * @return
     */
    @RequestMapping("getDefaultReply.do")
    public ModelAndView getDefaultReply() {
        ModelAndView mav = new ModelAndView();
        //获取默认回复
        String defaultReply = indexService.getDefaultReply();
        //把数据封装
        mav.addObject("dl",defaultReply);
        //定位页面
        mav.setViewName("chat");

        return mav;
    }

    /**
     * 获取自动回复
     *
     * @return
     */
    public String getAutoReply() {
        return indexService.getAutoReply();
    }

    /**
     * 根据输入内容获取回复
     *
     * @return
     */
    @RequestMapping("getReply.do")
    @ResponseBody
    public List<String> getReply(String keyword) {
        List<String> reply = indexService.getReply(keyword);
        return reply;
    }


//    =============后台需求==============

    /**
     * 获取所有输入内容
     *
     * @return
     */
    @RequestMapping("getAll.do")
    public ModelAndView getAll(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageNum", required = false, defaultValue = "5") Integer pageSize) {
        //创建对象
        ModelAndView mav = new ModelAndView();

        //获取所有内容
        PageInfo all = indexService.getAll(pageNum,pageSize);

        //增加数据
        mav.addObject("pageinfo", all);
        //设置页面
        mav.setViewName("listdemo");

        return mav;
    }

    /**
     * 增加一条回复内容
     *
     * @param replyContent
     * @return
     */
    @RequestMapping("addone.do")
    public ModelAndView addOne(ReplyContent replyContent) {
        ModelAndView mav = null;
        int i = indexService.addOne(replyContent);
        if (i > 0) {
            mav = getAll(1,5);
        } else {
            mav = new ModelAndView();
            mav.addObject("message", "增加回复失败");
            mav.setViewName("error");
        }
        return mav;
    }

    /**
     * 删除一条数据
     *
     * @param
     * @return
     */
    @RequestMapping("deleteOne.do")
    public ModelAndView deleteOne(Integer id) {
        ModelAndView mav = null;
        int i = indexService.deleteOne(id);
        if (i > 0) {
            mav = getAll(1,5);
        } else {
            mav = new ModelAndView();
            mav.addObject("message", "删除回复失败");
            mav.setViewName("error");
        }
        return mav;
    }

}
