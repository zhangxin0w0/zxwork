package com.itdr.controller;

import com.itdr.common.ServerResponse;
import com.itdr.service.DJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: DJController
 * 日期: 2020/11/9 17:12
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/dj/")
@ResponseBody
public class DJController {
    @Autowired
    DJService djService;

    @RequestMapping("sj.do")
    public ServerResponse sj(Integer num){
        return djService.sj(num);
    }
}
