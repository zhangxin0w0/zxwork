package com.itdr.games.runeland.pojo;

/**
 * ClassName: OrangeRune
 * 日期: 2019/11/22 15:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class OrangeRune extends Epigraph {
    private int adHurt; //物理攻击力
    private int apHurt; //法术攻击力
    private String adSpeed; //攻速
    static final String COLOR = "橙色";

    public OrangeRune() {

    }

    @Override
    public void show() {
        System.out.println("ename"+ename);
        System.out.println("adHurt:"+adHurt);
    }

    public int getAdHurt() {
        return adHurt;
    }

    public void setAdHurt(int adHurt) {
        this.adHurt = adHurt;
    }

    public int getApHurt() {
        return apHurt;
    }

    public void setApHurt(int apHurt) {
        this.apHurt = apHurt;
    }

    public String getAdSpeed() {
        return adSpeed;
    }

    public void setAdSpeed(String adSpeed) {
        this.adSpeed = adSpeed;
    }
}
