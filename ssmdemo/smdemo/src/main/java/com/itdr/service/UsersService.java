package com.itdr.service;

import com.itdr.pojo.Users;

/**
 * ClassName: UsersService
 * 日期: 2019/11/11 9:48
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UsersService {
    Users getOne(String uname);
}
