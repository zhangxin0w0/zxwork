package com.itdr.service.imp;

import com.itdr.common.ResponseCode;
import com.itdr.mapper.UsersMapper;
import com.itdr.pojo.Users;
import com.itdr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UsersServiceImpl
 * 日期: 2019/11/25 10:44
 *
 * @author Air张
 * @since JDK 1.8
 */
@Service
public class UsersServiceImpl implements UsersService {

    //引入数据层
    @Autowired
    UsersMapper usersMapper;


    private ResponseCode pd(Integer i, String msg) {
        if (i > 0) {
            return ResponseCode.toSuccess(i);
        }
        return ResponseCode.toFail(msg);
    }

    //增加一个新用户
    @Override
    public ResponseCode addone(String uname, String psd) {
        Users u = new Users();
        u.setUname(uname);
        u.setUpsd(psd);
        u.setStatus(0);

        int insert = usersMapper.insert(u);
        return pd(insert, "增加用户失败");
    }

    //删除一个用户
    @Override
    public ResponseCode deleteOne(Integer id) {
        int i = usersMapper.deleteByPrimaryKey(id);
        return pd(i, "删除用户失败");
    }
}
