package com.itdr.basic7;

/**
 * ClassName: StringTest2
 * 日期: 2019/12/3 10:49
 *
 * @author Air张
 * @since JDK 1.8
 */
public class StringTest2 {
    public static void main(String[] args) {
        byte[] b = {97,98,99};
        String s = new String(b);
        System.out.println(s);

        char[] c = new char[2];
        c[0] = 97;
        System.out.println(c[0]);

        s.equals("abc");
    }
}
