package com.itdr2.service;

import com.itdr2.pojo.Prop;

import java.util.List;

/**
 * ClassName: PropService
 * 日期: 2020/4/17 11:41
 *
 * @author Air张
 * @since JDK 1.8
 */
public class PropService {
//    这里处理用户请求的内容

    public List<Prop> getPropList(){
        PropDao propDao = new PropDao();
        List<Prop> propList = propDao.selectAll();
        return propList;
    }
}
