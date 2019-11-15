package com.itdr.basic2.demo1;

/**
 * ClassName: TestDemo4
 * 日期: 2019/11/13 14:41
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo4 {
    public static void main(String[] args){
//        一块平行四边形地，如果只把底增加8米，或只把高增加5米，
//        它的面积都增加40平方米。求这块平行四边形地原来的面积？

        //1.平行四边形面积=底*高
        //2.底增加8，面积增加40
        //3.高增加5，面积增加40

        int d = 40/5;
        int h = 40/8;
        int s = d*h;

        System.out.println("平行四边形的面积是："+s);
    }
}
