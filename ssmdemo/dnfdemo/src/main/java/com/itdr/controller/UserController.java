package com.itdr.controller;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.User;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * ClassName: UserController
 * 日期: 2020/11/2 14:19
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@ResponseBody
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户注册接口
     * @param userName
     * @param passWord
     * @return
     */
    @RequestMapping("register.do")
    public ServerResponse register(String userName, String passWord){
        return userService.register(userName,passWord);
    }

    /**
     * 用户登录
     * @param session
     * @param userName
     * @param passWord
     * @return
     */
    @RequestMapping("login.do")
    public ServerResponse login(HttpSession session,String userName, String passWord){
        ServerResponse login = userService.login(userName, passWord);
        if(login.isSuccess()){
            session.setAttribute("us",login.getData());
        }
        return login;
    }



}
