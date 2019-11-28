package com.itdr.games.auctiondemo.service;

import com.itdr.games.auctiondemo.dao.UserDao;
import com.itdr.games.auctiondemo.pojo.Users;

/**
 * ClassName: UserService
 * 日期: 2019/11/28 19:12
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserService {
    private UserDao ud = new UserDao();

    public String register(String uname,String psd){
        //参数非空判断
        //查看当前注册用户是否已经注册
        Users users = ud.selectByUname(uname);
        if(users != null){
            return "用户名已存在";
        }
        //注册用户，把用户信息存储起来
        Users u= new Users();
        u.setUname(uname);
        u.setPassword(psd);
        int i = ud.addOne(u);
        if(i<=0){
            return "用户注册失败";
        }
        //用户注册成功
        return "用户注册成功";
    }
}
