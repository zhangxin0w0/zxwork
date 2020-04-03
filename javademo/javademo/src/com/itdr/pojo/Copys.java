package com.itdr.pojo;

/**
 * ClassName: Copys
 * 日期: 2020/3/31 19:12
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Copys {
    // 副本序号
    private Integer id;
    // 副本名称
    private String cname;
    // 副本难度 从高到低 S\A\B\C\D\E
    private Character level;
    // 副本收益
    private Integer money;

    public Copys() {}

    public Copys(Integer id, String cname, Character level, Integer money) {
        this.id = id;
        this.cname = cname;
        this.level = level;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Character getLevel() {
        return level;
    }

    public void setLevel(Character level) {
        this.level = level;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

}
