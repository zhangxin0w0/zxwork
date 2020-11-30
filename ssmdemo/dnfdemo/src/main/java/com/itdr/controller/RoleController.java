package com.itdr.controller;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.Role;
import com.itdr.pojo.User;
import com.itdr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * ClassName: RoleController
 * 日期: 2020/11/9 14:22
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/role/")
@ResponseBody
public class RoleController {
    @Autowired
    RoleService roleService;

    /**
     * 角色创建
     * @param session
     * @param r
     * @return
     */
    @RequestMapping("insert.do")
    public ServerResponse insert(HttpSession session, Role r){
        User us = (User) session.getAttribute("us");
        if(us == null){
            return ServerResponse.toFailed("用户未登录");
        }
        return roleService.insert(r,us.getId());
    }

    /**
     * 查看角色
     * @param session
     * @return
     */
    @RequestMapping("all.do")
    public ServerResponse all(HttpSession session){
        User us = (User) session.getAttribute("us");
        if(us == null){
            return ServerResponse.toFailed("用户未登录");
        }
        return roleService.all(us.getId());
    }
}
