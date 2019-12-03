package com.itdr.games.auctiondemo.pojo;

/**
 * ClassName: ShopCar
 * 日期: 2019/12/3 19:31
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ShopCar {
    private String uname;
    private Product[] products = new Product[10];

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
