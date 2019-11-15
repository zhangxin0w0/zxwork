package com.itdr.service;

import com.itdr.mapper.IndexMapper;
import com.itdr.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UsersServiceImpl
 * 日期: 2019/11/11 9:49
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    IndexMapper indexMapper;

    @Override
    public Users getOne(String uname) {
        Users one = indexMapper.getOne(uname);
        return one;
    }
}
