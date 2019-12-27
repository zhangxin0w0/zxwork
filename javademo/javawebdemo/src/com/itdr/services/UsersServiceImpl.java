package com.itdr.services;

import com.itdr.dao.UsersDao;
import com.itdr.pojo.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UsersServiceImpl
 * 日期: 2019/12/26 10:26
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UsersServiceImpl implements UsersService{
    UsersDao ud = new UsersDao();

    @Override
    public int register(String username, String password) {
        if(username == null || username.equals("")){
            return 0;
        }
        if(password == null || "".equals(password)){
            return 0;
        }

        //用户名是否存在
        Users users = ud.selectByUsername(username);
        if(users != null){
            return 0;
        }
        //用户名不存在才保存
        int i = ud.insertByUsernameAndPassword(username, password);


        return i;
    }

    @Override
    public List<Users> getAll() {
        List<Users> li = ud.selectAll();
        return li;
    }
}
