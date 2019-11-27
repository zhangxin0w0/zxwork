package com.itdr.games.runeland.pojo;

/**
 * ClassName: GreenRune
 * 日期: 2019/11/22 15:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class GreenRune extends Epigraph{
    static final String COLOR = "绿色";

    private double cd; //冷却时间，小数表示，会有精度丢失的问题

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public GreenRune(){

    }
}
