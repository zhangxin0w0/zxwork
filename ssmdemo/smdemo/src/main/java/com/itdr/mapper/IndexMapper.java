package com.itdr.mapper;

import com.itdr.pojo.Users;

/**
 * ClassName: IndexMapper.xml
 * 日期: 2019/11/11 8:48
 *
 * @author Air张
 * @since JDK 1.8
 */

public interface IndexMapper {
    Users getOne(String uname);
}
