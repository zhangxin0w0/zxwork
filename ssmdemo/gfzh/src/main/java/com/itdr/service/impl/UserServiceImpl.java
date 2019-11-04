package com.itdr.service.impl;

import com.itdr.mapper.UserMapper;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * 日期: 2019/10/21 11:21
 *
 * @author Air张
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Users login(String uphone, String upsd) {
        //参数非空判断
        Users u = userMapper.selectByUphoneAndUpsd(uphone,upsd);

        return u;
    }

    @Override
    public List<Users> getOne(String keyword) {
        //参数非空判断

        //参数处理
        String keys = "%"+keyword+"%";
        List<Users> li = userMapper.selectByKeyWord(keys);
        return li;
    }
}
