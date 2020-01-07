package com.itdr2.trash.controller;

import com.itdr2.trash.pojo.Rubbish;
import com.itdr2.trash.pojo.RubbishCan;
import com.itdr2.trash.service.GameService;
import com.itdr2.trash.service.GameServiceImpl;

import java.util.List;

/**
 * ClassName: GameController
 * 日期: 2019/12/27 15:56
 *
 * @author Air张
 * @since JDK 1.8
 */
public class GameController {
    private GameService gs = new GameServiceImpl();

    //随机分配垃圾
    public List<Rubbish> randomRubbish(){
        return gs.randomRubbish();
    }

    //积分核算
    public int checkSort(Rubbish rs, RubbishCan rc){
        int i = gs.checkSort(rs,rc);
        return i;
    }
}
