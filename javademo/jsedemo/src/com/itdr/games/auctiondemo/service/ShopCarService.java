package com.itdr.games.auctiondemo.service;

import com.itdr.games.auctiondemo.dao.ShopCarDao;
import com.itdr.games.auctiondemo.pojo.Product;
import com.itdr.games.auctiondemo.pojo.Users;

/**
 * ClassName: ShopCarService
 * 日期: 2019/12/3 19:57
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ShopCarService {
    private ShopCarDao shopCarDao = new ShopCarDao();

    public String addOne(Product p,Users u){
        int i = shopCarDao.addOne(p,u);
        if(i<=0){
            return "商品加入失败";
        }else{
            return "商品加入成功";
        }
    }
}
