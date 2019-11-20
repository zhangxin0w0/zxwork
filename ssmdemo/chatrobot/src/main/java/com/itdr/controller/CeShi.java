package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: CeShi
 * 日期: 2019/11/18 8:45
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller

public class CeShi {
    @RequestMapping("/ceshi.do")
    public String ceshi(){
        System.out.println("请求进来了");
        return "chat";
    }
}
