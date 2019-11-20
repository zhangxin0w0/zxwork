package com.itdr.basic3.demo3;

import com.itdr.basic3.demo2.Food;
import com.itdr.basic3.demo4.Student;

/**
 * ClassName: TestDemo
 * 日期: 2019/11/20 14:03
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo {
    public static void main(String[] args) {
        int s =  new TestDemo().add(1,2);
        System.out.println(s);
        Food f = new Food();

        /*Student s2 = new Student();
        System.out.println(s2.sname);
        System.out.println(s2.arr);
        System.out.println(s2.sh);
        System.out.println(s2.price);
        System.out.println(s2.bol);
        System.out.println(s2.bj);*/
    }


    public int add(int a,int b){
        return a+b;
    }
}
