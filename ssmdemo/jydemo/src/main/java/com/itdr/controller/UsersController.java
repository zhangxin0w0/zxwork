package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: UsersController
 * 日期: 2019/11/25 10:40
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/back/users/")
@ResponseBody
public class UsersController {

    //引入业务层
    @Autowired
    UsersService usersService;


    /**
     * 增加一个新用户
     * @param uname
     * @param psd
     * @return
     */
    @RequestMapping("addone.do")
    public ResponseCode addOne(String uname, String psd){
        ResponseCode rs = usersService.addone(uname,psd);
        return rs;
    }

    /**
     * 删除一个用户
     * @param id
     * @return
     */
    @RequestMapping("deleteone.do")
    public ResponseCode deleteOne(Integer id){
        ResponseCode rs = usersService.deleteOne(id);
        return rs;
    }
}
