package com.itdr2.trash.service;

import com.itdr2.trash.pojo.Rubbish;
import com.itdr2.trash.pojo.RubbishCan;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GameServiceImpl
 * 日期: 2019/12/27 16:05
 *
 * @author Air张
 * @since JDK 1.8
 */
public class GameServiceImpl implements GameService {
    private RubbishService rs = new RubbishServiceImpl();
    private RubbishCanService rcs = new RubbishCanServiceImpl();

    @Override
    public List<Rubbish> randomRubbish() {
        //创建集合用来存储随机拿出来的垃圾
        List<Rubbish> newLi = new ArrayList<Rubbish>();
        //从数据库获取所有的垃圾
        List<Rubbish> all = rs.getAll();

        //判断是否有垃圾
        if(all.size() != 0) {
            //产生一个随机数，用来确定随机拿几个垃圾
            long round = Math.round(Math.random() * all.size());
            //遍历取出垃圾
            for (int i = 0; i < round; i++) {
                //随机拿出
                int rou = (int) Math.round(Math.random() * round);
                //取出一个垃圾
                Rubbish rubbish = all.get(rou);
                //放到新的集合中
                newLi.add(rubbish);
            }
        }
        return newLi;
    }


    @Override
    public int checkSort(Rubbish rs, RubbishCan rc) {
        if(!rcs.man(rc)){
            return 0;
        }
        if(rs.getRtype().equals(rc.getRtype())){
            return 1;
        }else{
            return -1;
        }
    }
}
