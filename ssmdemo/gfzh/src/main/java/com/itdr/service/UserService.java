package com.itdr.service;

import com.itdr.pojo.Users;

import java.util.List;

/**
 * ClassName: UserService
 * 日期: 2019/10/21 11:21
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UserService {
    Users login(String uphone, String upsd);

    List<Users> getOne(String keyword);

}
