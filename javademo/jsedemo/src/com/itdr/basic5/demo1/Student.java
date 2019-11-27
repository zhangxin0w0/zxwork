package com.itdr.basic5.demo1;

/**
 * ClassName: Student
 * 日期: 2019/11/27 13:46
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Student extends Person{
    private int sid;

    @Override
    public void playGame() {
        System.out.println("学生玩英雄联盟");
    }
}
