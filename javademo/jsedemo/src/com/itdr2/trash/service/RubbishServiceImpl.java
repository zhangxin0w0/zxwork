package com.itdr2.trash.service;

import com.itdr2.trash.dao.RubbishDao;
import com.itdr2.trash.pojo.Rubbish;

import java.util.List;

/**
 * ClassName: RubbishServiceImpl
 * 日期: 2019/12/27 15:50
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishServiceImpl implements RubbishService{
    private RubbishDao rd = new RubbishDao();
    @Override
    public List<Rubbish> getAll() {
        List<Rubbish> li = rd.selectAll();
        return li;
    }
}
