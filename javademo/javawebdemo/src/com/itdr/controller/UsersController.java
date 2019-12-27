package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.services.UsersService;
import com.itdr.services.UsersServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UsersController
 * 日期: 2019/12/26 10:23
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UsersController {
    UsersService us = new UsersServiceImpl();

    public int register(String username,String password){
        int register = us.register(username, password);
        return register;
    }

    //查询所有用户对象
    public List<Users> getAll(){
        List<Users> li = us.getAll();
        return li;
    }
}
