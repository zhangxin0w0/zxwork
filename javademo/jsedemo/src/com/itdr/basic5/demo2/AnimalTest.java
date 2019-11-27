package com.itdr.basic5.demo2;

/**
 * ClassName: AnimalTest
 * 日期: 2019/11/27 18:15
 *
 * @author Air张
 * @since JDK 1.8
 */
public class AnimalTest {
    public static void main(String[] args) {
        PowerInter p = new GafferCat();
        p.read();
        PowerInter p2 = new TomCat();
        p2.read();
    }
}
