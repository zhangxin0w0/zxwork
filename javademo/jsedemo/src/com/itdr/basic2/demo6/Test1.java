package com.itdr.basic2.demo6;

/**
 * ClassName: Test1
 * 日期: 2019/11/15 15:40
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test1 {
    public static void main(String[] args) {
        //创建一个数据类型是int类型的长度为5的数组
        int[] arr = new int[5];

      /*  //向数组中放一个数据
        arr[0] = 2;

        //从数组中取一个数据
        int m = arr[1];

        System.out.println(m);*/

        //把数组中的空间充满
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //把数组中的数据依次取出来,正序遍历数组
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.println(n);
        }

        //把数组中的数据依次取出来,倒序遍历数组
        for (int i = arr.length-1; i >= 0; i--) {
            int n = arr[i];
            System.out.println(n);
        }
    }
}
