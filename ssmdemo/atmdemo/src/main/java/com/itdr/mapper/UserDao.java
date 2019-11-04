package com.itdr.mapper;

import com.itdr.pojo.Users;

/**
 * ClassName: UserDao
 * 日期: 2019/10/28 15:46
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface UserDao {
    //查询一个用户
    Users getOne(Integer uid);

    //增加一个用户
    int addOne(Users u);

    //修改一个用户
    int updateOne(Users u);

    //删除一个用户
    int deleteOne(Users u);
}
