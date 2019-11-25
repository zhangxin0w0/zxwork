package com.itdr.games.runeland;

import com.itdr.games.runeland.pojo.Epigraph;
import com.itdr.games.runeland.pojo.OrangeRune;

/**
 * ClassName: RuneTest
 * 日期: 2019/11/22 15:45
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RuneTest {
    public static void main(String[] args) {
        //初始化
        //准备存放符文的数组
        Epigraph[] epi = new Epigraph[93];

        Epigraph p = new OrangeRune();
        p.showOrange();
    }
}
