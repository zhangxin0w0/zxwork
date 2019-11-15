package com.itdr.controller;

import com.itdr.pojo.ReplyContent;
import com.itdr.service.ReplyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName: ReplyContentController
 * 日期: 2019/11/11 10:47
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/portal/reply/")
public class ReplyContentController {

    @Autowired
    ReplyContentService replyContentService;

    @RequestMapping("getone.do")
    public ModelAndView getOne(Integer id){
        ModelAndView mav = new ModelAndView();
        ReplyContent one = replyContentService.getOne(id);
        mav.addObject("replycontent",one);
        mav.setViewName("home");
        return mav;
    }
}
