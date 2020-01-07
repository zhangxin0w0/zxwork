package com.itdr2.trash.service;

import com.itdr2.trash.dao.RubbishCanDao;
import com.itdr2.trash.pojo.RubbishCan;

/**
 * ClassName: RubbishCanServiceImpl
 * 日期: 2019/12/27 16:25
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishCanServiceImpl implements RubbishCanService {
    private RubbishCanDao rcd = new RubbishCanDao();

    @Override
    public boolean man(RubbishCan rc) {
        RubbishCan rcl = rcd.selectByRname(rc);
        if(rcl.getSjrl() >= rcl.getRl()){
            return false;
        }else{
            return true;
        }
    }
}
