package com.itdr.basic7;

/**
 * ClassName: StringTest
 * 日期: 2019/12/3 10:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("java");
        String s2 = "abc";
        String s3 = "aaa";
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        String s4 = s2+s3;

    }
}
