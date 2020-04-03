package com.itdr.pojo;

/**
 * ClassName: Goods
 * 日期: 2020/4/1 18:10
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Goods {
    // 序号
    private Integer id;
    // 道具名称
    private String gname;
    // 道具效果
    private String buff;
    // 道具价格
    private Integer price;

    public Goods() {
    }

    public Goods(Integer id, String gname, String buff, Integer price) {
        this.id = id;
        this.gname = gname;
        this.buff = buff;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getBuff() {
        return buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
