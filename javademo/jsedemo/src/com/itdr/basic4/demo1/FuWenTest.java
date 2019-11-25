package com.itdr.basic4.demo1;

/**
 * ClassName: FuWenTest
 * 日期: 2019/11/22 14:55
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class FuWenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FuWen f1 = new FuWen();
//        f1.adHurt = 100;
//        f1.apHurt = 0;
//        System.out.println("物理攻击："+f1.adHurt+"魔法攻击："+f1.apHurt);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=100){
            f1.setAdHurt(a);
        }
        if(b<=10){
            f1.setApHurt(b);
        }

        System.out.println("物理攻击："+f1.getAdHurt());
        System.out.println("魔法攻击："+f1.getApHurt());

        f1.setAdHurt(100000);
        System.out.println("物理攻击："+f1.getAdHurt());
    }
}
