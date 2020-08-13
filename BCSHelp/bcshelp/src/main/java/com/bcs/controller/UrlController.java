package com.bcs.controller;

import com.bcs.common.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: IndexController
 * 日期: 2019/10/18 13:19
 *
 * @author Air张
 * @since JDK 1.8
 */

@RestController
@RequestMapping("/portal/url/")
public class UrlController {

    // 获取一个分类下所有连接
    @RequestMapping("all.do")
    public ServerResponse getAll(){
        ServerResponse s = ServerResponse.successRS("Ok");
        return s;
    }
}
