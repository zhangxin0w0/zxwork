package com.itdr.games.auctiondemo.controller;

import com.itdr.games.auctiondemo.pojo.Users;
import com.itdr.games.auctiondemo.service.UserService;

/**
 * ClassName: UserController
 * 日期: 2019/11/28 19:11
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserController {
    private UserService us = new UserService();

    //用户注册，需要两个参数，用户名和密码，注册成功返回用户信息
    public String register(String uname,String psd){
        String s = us.register(uname, psd);
        return s;
    }

    //用户登录
}
