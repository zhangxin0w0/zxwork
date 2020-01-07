package com.itdr2.trash.service;

import com.itdr2.trash.pojo.Rubbish;
import com.itdr2.trash.pojo.RubbishCan;

import java.util.List;

/**
 * ClassName: GameService
 * 日期: 2019/12/27 16:03
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface GameService {
    List<Rubbish> randomRubbish();

    int checkSort(Rubbish rs, RubbishCan rc);
}
