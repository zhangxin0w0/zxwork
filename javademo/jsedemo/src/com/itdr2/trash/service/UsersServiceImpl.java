package com.itdr2.trash.service;

import com.itdr2.trash.dao.UsersDao;
import com.itdr2.trash.pojo.Users;

/**
 * ClassName: UsersServiceImpl
 * 日期: 2019/12/27 15:04
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UsersServiceImpl implements UsersService{
    private UsersDao ud = new UsersDao();

    @Override
    public void register(String uname) {
        Users users = ud.selectByUname(uname);

        if(users != null){
            return;
        }
        Users u = new Users();
        u.setUsername(uname);
        ud.insertByUname(u);
    }
}
