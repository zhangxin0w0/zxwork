package com.itdr.basic6;

/**
 * ClassName: ObiectTest
 * 日期: 2019/11/29 15:37
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object o = new Object();

        A a = new A();
        int i = a.hashCode();
        System.out.println(i); //356573597

        A a2 = new A();
        int i2 = a2.hashCode();
        System.out.println(i2); //1735600054

        Class aClass = o.getClass();
        String name = aClass.getName();
        System.out.println(name);
        System.out.println("==================");
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(a.getClass().getName()+"@"+Integer.toHexString(a.hashCode()));

        boolean equals = a.equals(a2);
        System.out.println(equals);


    }
}
