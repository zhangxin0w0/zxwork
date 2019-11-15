package com.itdr.basic2.demo4;

/**
 * ClassName: Test3
 * 日期: 2019/11/14 14:15
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test3 {
    public static void main(String[] args) {
//        计算1~100之间奇数的和

        int s = 0;

        for (int i = 1; i < 101; i++) {
            //每次循环，判断I的值是奇数还是偶数，如果是奇数就加起来，偶数就不用管
            if (i % 2 != 0) {
                //把每一个奇数加起来
                s += i;
            }
        }
        System.out.println(s);
    }
}
