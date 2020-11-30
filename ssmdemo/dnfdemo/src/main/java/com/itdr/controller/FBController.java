package com.itdr.controller;

import com.itdr.common.ServerResponse;
import com.itdr.service.FBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: FBController
 * 日期: 2020/11/9 15:51
 *
 * @author Air张
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/fb/")
@ResponseBody
public class FBController {
    @Autowired
    FBService fbService;

    /**
     * 获取副本列表
     *
     * @return
     */
    @RequestMapping("all.do")
    public ServerResponse all() {
        return fbService.all();
    }

    /**
     * 产生随机数据的规则
     *
     * @param type
     * @param lv
     * @return
     */
    @RequestMapping("sjsj.do")
    public ServerResponse sjsj(Integer type, Integer lv) {
        return fbService.sjsj(type, lv);
    }

    @RequestMapping("js.do")
    public ServerResponse js(Integer lv, Integer fid, Integer rid, Integer uid) {
        return fbService.js(lv, fid, rid, uid);
    }
}
