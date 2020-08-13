package com.itdr2.pojo;

/**
 * ClassName: Prop
 * 日期: 2020/4/17 11:35
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Prop {
//    序号
    private Integer id;
//    名字
    private String pname;
//    价格
    private int price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Prop{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
