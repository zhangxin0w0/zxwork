package com.itdr.services;

import com.itdr.pojo.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UsersService
 * 日期: 2019/12/26 10:25
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UsersService {
    int register(String username,String password);

    List<Users> getAll();

}
