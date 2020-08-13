package com.itdr2.common;

/**
 * ClassName: Derived
 * 日期: 2020/4/20 10:54
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Derived extends Base {
    public void methodOne()
    {
        super.methodOne();
        System.out.print("C");
    }

    public void methodTwo()
    {
        super.methodTwo();
        System.out.print("D");
    }
}
