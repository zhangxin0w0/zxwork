package com.itdr.games.demo2;

/**
 * ClassName: Datas
 * 日期: 2019/11/20 18:46
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Datas {
    String category; //数据类型
    String yz; //原始值
    String xz; //新的值

    //无参构造方法
    public Datas() {

    }

    //有参构造方法
    public Datas(String c, String y, String x) {
        this.category = c;
        this.yz = y;
        this.xz = x;
    }

    public static void main(String[] args) {
        Datas d = new Datas("生肖", "鸡", "苏");
        Datas d2 = new Datas("生肖", "鸡", "苏");

        System.out.println(d.yz);
        System.out.println(d.xz);
    }
}
