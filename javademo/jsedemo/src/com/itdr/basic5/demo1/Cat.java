package com.itdr.basic5.demo1;

/**
 * ClassName: Cat
 * 日期: 2019/11/27 14:16
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Cat {
    private static Cat c = new Cat();

    private Cat(){}

    public static Cat getCat(){
        return c;
    }
}
