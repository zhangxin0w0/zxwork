package com.itdr.basic3.demo5;

/**
 * ClassName: Car
 * 日期: 2019/11/20 15:04
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Car {
    String color;

    public static void main(String[] args) {
       /* String color = "hong";
        System.out.println(color);*/

        Car c = new Car();
        Car c2 = c;
        c.color = "红色";
        System.out.println(c2.color);
        int a = 1;

    }

    public static void run(String color){
        System.out.println("行驶");
    }
}
