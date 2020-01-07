package com.itdr2.trash.controller;

import com.itdr2.trash.service.UsersService;
import com.itdr2.trash.service.UsersServiceImpl;

/**
 * ClassName: UsersController
 * 日期: 2019/12/27 15:03
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UsersController {
    private UsersService us = new UsersServiceImpl();

    //用户注册
    public void register(String uname){
        us.register(uname);
    }

    //更新用户积分
    public int updateSort(Integer num){
        int i = us.updateSort(num);
        return i;
    }

}
