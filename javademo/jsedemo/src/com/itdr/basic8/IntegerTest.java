package com.itdr.basic8;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * ClassName: IntegerTest
 * 日期: 2019/12/3 18:52
 *
 * @author Air张
 * @since JDK 1.8
 */
public class IntegerTest {
    public static void main(String[] args) {
        //1.数组长度固定，集合长度不固定
        //2.数组可以放任意数据类型值，集合只能存放对象
        //3.数组只能存放同一种数据，集合可以存放任意对象

        int a = 10;
        ArrayList li = new ArrayList();
        A aa = new A();
        li.add("ok");
        li.add(123);
        li.add(true);
        li.add(1.0);
        li.add('张');
        li.add(a);
        li.add(aa);

        int[] b = new int[10];
        byte s = 1;
        b[0] = s;
//        b[1] = "ok";

        //遍历集合元素
        for (int i = 0; i < li.size(); i++) {
            Object o = li.get(i);
            System.out.println(o);
        }
    }
}
