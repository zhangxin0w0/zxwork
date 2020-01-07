package com.itdr2.trash.controller;

import com.itdr2.trash.pojo.RubbishCan;
import com.itdr2.trash.service.RubbishCanService;
import com.itdr2.trash.service.RubbishCanServiceImpl;

/**
 * ClassName: RubbishCanController
 * 日期: 2019/12/27 16:22
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishCanController {
    private RubbishCanService rs = new RubbishCanServiceImpl();

    //判断当前垃圾桶是否满了
    public boolean man(RubbishCan rc){
        boolean b = rs.man(rc);
        return b;
    }
}
