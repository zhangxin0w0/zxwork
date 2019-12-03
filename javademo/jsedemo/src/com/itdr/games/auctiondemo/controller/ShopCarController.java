package com.itdr.games.auctiondemo.controller;

import com.itdr.games.auctiondemo.pojo.Product;
import com.itdr.games.auctiondemo.pojo.ShopCar;
import com.itdr.games.auctiondemo.pojo.Users;
import com.itdr.games.auctiondemo.service.ShopCarService;

/**
 * ClassName: ShopCar
 * 日期: 2019/12/3 19:37
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ShopCarController {

    ShopCarService shopCarService = new ShopCarService();

    //把一个商品放入购物车
    public String addOne(Product p,Users u ){
        String s = shopCarService.addOne(p, u);
        return s;
    }
}
