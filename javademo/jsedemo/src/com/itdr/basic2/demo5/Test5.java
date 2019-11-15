package com.itdr.basic2.demo5;

/**
 * ClassName: Test5
 * 日期: 2019/11/15 15:10
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Test5 {
    public static void main(String[] args) {
//        母鸡3元/只，公鸡4元/只，小鸡0.5元/只，如果花100元买100只鸡，有多少种情况？
        for(int i = 0;i<34;i++){
            for(int j = 0;j<26;j++){
                for(int m = 0;m<101;m++){
                    if((i+j+m) == 100 &&(3*i+4*j+0.5*m) == 100){
                        System.out.println("母鸡"+i);
                        System.out.println("公鸡"+j);
                        System.out.println("小鸡"+m);
                    }
                }
            }
        }
    }
}
