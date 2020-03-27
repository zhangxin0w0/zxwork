package com.itdr.controller;

import com.itdr.common.ResponseCode;
import com.itdr.pojo.Users;
import com.itdr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

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
@SessionAttributes
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

    //根据ID查找一个用户
    @RequestMapping("selectone.do")
    public ResponseCode selectOne(Integer id){
        ResponseCode rs = usersService.selectOne(id);
        return rs;
    }

    //修改用户数据
    @RequestMapping("updateone.do")
    public ResponseCode updateOne(Users u){
        ResponseCode rs = usersService.updateOne(u);
        return rs;
    }

}
