package com.itdr.basic5.demo2;

/**
 * ClassName: TomCat
 * 日期: 2019/11/27 18:12
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TomCat extends Animal implements PowerInter{
    @Override
    public void eat() {
        System.out.println("Tom猫要吃杰瑞");
    }


    @Override
    public void read() {
        System.out.println("Tom猫会读Java手册");
    }
}
