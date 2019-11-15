package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName: UsersController
 * 日期: 2019/11/11 9:50
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/portal/user/")
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping("one.do")
    public ModelAndView getOne(String uname){
        Users one = usersService.getOne(uname);
        ModelAndView mav = new ModelAndView();
        mav.addObject("user",one);
        mav.setViewName("home");
        return mav;
    }
}
