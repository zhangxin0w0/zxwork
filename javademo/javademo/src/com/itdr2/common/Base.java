package com.itdr2.common;

/**
 * ClassName: Base
 * 日期: 2020/4/20 10:54
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Base {
    public void methodOne()
    {
        System.out.print("A");
        methodTwo();
    }

    public void methodTwo()
    {
        System.out.print("B");
    }
}
