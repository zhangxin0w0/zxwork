package com.itdr.games.auctiondemo.dao;

import com.itdr.games.auctiondemo.pojo.Product;
import com.itdr.games.auctiondemo.pojo.ShopCar;
import com.itdr.games.auctiondemo.pojo.Users;

/**
 * ClassName: ShopCarDao
 * 日期: 2019/12/3 19:44
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ShopCarDao {
    private ShopCar shopCar = new ShopCar();
    private static ShopCar[] shopCars = new ShopCar[10];

    //把一个商品加入到购物车中，有对应的数量
    public int addOne(Product p,Users u ){
        shopCar.setUname(u.getUname());
        Product[] products = shopCar.getProducts();
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null){
                products[i] = p;
                return 1;
            }
        }
        return -1;
    }

    public int addOne2(Product p,Users u ){
        Product[] products = u.getShopCar().getProducts();
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null){
                products[i] = p;
                return 1;
            }
        }
        return -1;
    }
}
