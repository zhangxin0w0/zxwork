package com.itdr.basic5.demo2;

/**
 * ClassName: GafferCat
 * 日期: 2019/11/27 18:09
 *
 * @author Air张
 * @since JDK 1.8
 */
public class GafferCat extends Animal implements PowerInter{

    @Override
    public void eat() {
        System.out.println("加菲猫做着吃披萨");
    }

    @Override
    public void read() {
        System.out.println("加菲猫会读报纸");
    }

//    public void read(){
//
//    }
}
