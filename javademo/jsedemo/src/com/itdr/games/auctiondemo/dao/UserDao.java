package com.itdr.games.auctiondemo.dao;

import com.itdr.games.auctiondemo.pojo.Users;

/**
 * ClassName: UserDao
 * 日期: 2019/11/28 19:12
 *
 * @author Air张
 * @since JDK 1.8
 */
public class UserDao {
    //用户数据数组
    private static Users[] users;
    static {
        users = new Users[10];
    }

    //根据用户名查找一个用户
    public Users selectByUname(String uname){
        //遍历用户数组，查看非空空间内的对象和传进来的用户名是否同名
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null){
                if(users[i].getUname().equals(uname)){
                    return users[i];
                }
            }
        }
        return null;
    }

    //往数据数组内放入一个新用户
    public int addOne(Users u){
        //遍历用户数组，找到空的位置，存放新的用户数据
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null){
                users[i] = u;
                return 1;
            }
        }
        return 0;
    }
}
