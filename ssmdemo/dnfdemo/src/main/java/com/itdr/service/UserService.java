package com.itdr.service;

import com.itdr.common.ServerResponse;

/**
 * ClassName: UserService
 * 日期: 2020/11/2 15:13
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UserService {
    ServerResponse register(String userName, String passWord);

    ServerResponse login(String userName, String passWord);
}
