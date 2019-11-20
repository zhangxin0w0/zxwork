package com.itdr.basic3.demo2;

/**
 * ClassName: TestDemo
 * 日期: 2019/11/20 11:01
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        //你自己开了一家店
        //店里面卖的是同一种类型的商品
        //每个商品有不同的颜色
        //这个类型的商品有一个共同的功能
        //顾客来店里购物的时候，向顾客展示店里的商品

        //创建一个商品类，有属性和功能
        //创建这个类的一些对象，有各自不同的属性值
        //把这些对象放到一个数组里
        //遍历数组里的对象，输出对象的属性
        Scanner sc = new Scanner(System.in);

        //准备开店
        Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        //定义商品的属性（初始化对象）
        f1.fname = "苹果";
        f1.price = 1;
        f2.fname = "菠萝";
        f2.price = 2;
        f3.fname = "椰子";
        f3.price = 3;
        //准备一个货架（现在只能用数组）
        Food[] arr = new Food[5];
        arr[0] = f1;
        arr[1] = f2;
        arr[2] = f3;

        System.out.println("====================");
        System.out.println("欢迎来到我的小店");
        System.out.println("请选购以下商品：");
        //通过遍历数组，取出所有商品并展示出来
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != null){
                System.out.println("商品序号："+i+"商品名称："+arr[i].fname+"商品价格："+arr[i].price);
            }
        }
        //顾客选购商品
        System.out.println("请选择自己喜欢的商品序号：");
        int m = sc.nextInt();
        //输出顾客选购的商品
        if(m<arr.length && m>=0){
            System.out.println("商品序号："+m+"商品名称："+arr[m].fname+"商品价格："+arr[m].price);
        }else{
            System.out.println("你选择的商品"+m+"不存在");
        }

    }
}
