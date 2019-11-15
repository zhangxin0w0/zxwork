package com.itdr.basic2.demo2;

/**
 * ClassName: TestDemo2
 * 日期: 2019/11/13 15:01
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

       /* b = ++a;
        System.out.println("前自增");
        System.out.println(a);
        System.out.println(b);

        b = a++;
        System.out.println("后自增");
        System.out.println(a);
        System.out.println(b);*/

        int c = a++ + ++a + ++b;
        System.out.println(a);//3
        System.out.println(b);//1
        System.out.println(c);//4
    }
}
