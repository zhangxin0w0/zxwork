package com.itdr.controller;

import com.itdr.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: IndexController
 * 日期: 2019/10/14 10:32
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/show.do")
    @ResponseBody
    public String show(String u,Integer p){
        System.out.println(u);
        System.out.println(p);
        return "<h1>java</h1>";
    }


}
