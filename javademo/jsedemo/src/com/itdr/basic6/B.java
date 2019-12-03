package com.itdr.basic6;

/**
 * ClassName: B
 * 日期: 2019/11/29 15:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public class B implements Cloneable{
    String name;
    int a;
    public void show(){}

    public static void main(String[] args) throws Throwable {
        B b = new B();
        System.out.println(b.clone() != b);
        b.finalize();
    }
}
