package com.itdr.cpntroller;

import com.itdr.common.ResponseBodyCode;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * ClassName: UserController
 * 日期: 2019/10/21 11:14
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/portal/users/")
@ResponseBody
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login.do")
    public Users login(String uphone, String upsd, HttpSession session) {
        //登录成功，保存用户数据到session中，方便后面再次使用
        Users u = userService.login(uphone, upsd);

        if (u != null) {
            session.setAttribute("user", u);
        }
        return u;
    }


    @RequestMapping("getOne.do")
    public ResponseBodyCode getOne(String keyword) {
        List<Users> li = userService.getOne(keyword);

        return ResponseBodyCode.successData(li);
    }
}
