package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.mapper.UserMapper;
import com.itdr.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * 日期: 2020/11/2 15:13
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public ServerResponse register(String userName, String passWord) {
        // 1.要注册的用户是否存在
        User u = userMapper.selectByUserName(userName);
        if (u != null) {
            // 说明要注册的账户已经存在
            return ServerResponse.toFailed("账户已存在");
        }

        // 2.当要注册的用户名不存在时，插入一条新数据
        int i = userMapper.insertOne(userName, passWord);
        if (i <= 0) {
            // 插入失败
            return ServerResponse.toFailed("用户注册失败");
        }

        // 成功返回成功数据
        return ServerResponse.toSuccess("注册成功");
    }

    @Override
    public ServerResponse login(String userName, String passWord) {
        // 1.判断用户是否存在
        User u = userMapper.selectByUserName(userName);
        if (u == null) {
            return ServerResponse.toFailed("账户不存在");
        }
        // 2.用户存在，判断密码是否匹配
        if(!u.getPassword().equals(passWord)){
            return ServerResponse.toFailed("用户名或密码错误");
        }

        // 3.返回成功数据，不包括密码
        u.setPassword("");
        return ServerResponse.toSuccess(u);
    }

}
