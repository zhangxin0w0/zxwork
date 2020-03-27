package com.itdr.service;

import com.itdr.common.ResponseCode;
import com.itdr.pojo.Users;

/**
 * ClassName: UsersService
 * 日期: 2019/11/25 10:44
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UsersService {
    //增加一个新用户
    ResponseCode addone(String uname, String psd);

    ResponseCode deleteOne(Integer id);

    ResponseCode selectOne(Integer id);

    ResponseCode updateOne(Users u);
}
