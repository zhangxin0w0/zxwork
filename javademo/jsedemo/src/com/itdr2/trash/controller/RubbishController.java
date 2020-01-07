package com.itdr2.trash.controller;

import com.itdr2.trash.pojo.Rubbish;
import com.itdr2.trash.service.RubbishService;
import com.itdr2.trash.service.RubbishServiceImpl;

import java.util.List;

/**
 * ClassName: RubbishController
 * 日期: 2019/12/27 15:48
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishController {
    private RubbishService rs = new RubbishServiceImpl();

    public List<Rubbish> getAll(){
        List<Rubbish> all = rs.getAll();
        return all;
    }
}
