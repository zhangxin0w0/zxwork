package com.itdr.cpntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: IndexController
 * 日期: 2019/10/21 11:05
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/portal/index/")
public class IndexController {

    @RequestMapping("ceshi.do")
    @ResponseBody
    public String ceshi(){
        System.out.println("OK");
        return "<h1>OK</h1>";
    }
}
