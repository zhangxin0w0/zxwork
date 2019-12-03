package com.itdr.games.auctiondemo;

import com.itdr.games.auctiondemo.controller.ShopCarController;
import com.itdr.games.auctiondemo.controller.UserController;
import com.itdr.games.auctiondemo.pojo.Product;
import com.itdr.games.auctiondemo.pojo.Users;

/**
 * ClassName: AuctionTest
 * 日期: 2019/11/28 19:41
 *
 * @author Air张
 * @since JDK 1.8
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class AuctionTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String uname = sc.next();
//        System.out.println("请输入密码：");
//        String psd = sc.next();
//
//        UserController uc = new UserController();
//        String register = uc.register(uname,psd);
//        System.out.println(register);

        ShopCarController shopCarController = new ShopCarController();
        Users u = new Users();
        u.setUname("zhangxin");
        u.setPassword("123");

        int i = 3;
        while (i>0){
            Product p = new Product();
            p.setPname("苹果"+i);
            p.setPrice(new BigDecimal(""+i));


            shopCarController.addOne(p,u);
            i--;
        }

    }
}
