package com.itdr.controller;

import com.itdr.common.ServerResponse;
import com.itdr.service.CKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: CKController
 * 日期: 2020/11/9 16:05
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/ck/")
@ResponseBody
public class CKController {
    @Autowired
    CKService ckService;

    /**
     * 查看当前角色仓库中道具
     * @param roleId
     * @return
     */
    @RequestMapping("roledj.do")
    public ServerResponse roleDJ(Integer roleId){
        return ckService.roleDJ(roleId);
    }
}
