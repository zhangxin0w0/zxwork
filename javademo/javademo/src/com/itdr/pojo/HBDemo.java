package com.itdr.pojo;

/**
 * ClassName: HBDemo
 * 日期: 2020/4/16 10:01
 *
 * @author Air张
 * @since JDK 1.8
 */

public class HBDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = "hello";

        System.err.println(str1 == str2);
    }

    public void show(int a,long c){}
    public void show(long c,int a){}
}

