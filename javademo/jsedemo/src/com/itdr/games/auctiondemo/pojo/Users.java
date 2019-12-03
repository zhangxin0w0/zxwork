package com.itdr.games.auctiondemo.pojo;

/**
 * ClassName: Users
 * 日期: 2019/11/28 19:09
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Users {
    private String uname;
    private String password;
    private ShopCar shopCar = new ShopCar();
    private int[] a = new int[5];

    public ShopCar getShopCar() {
        return shopCar;
    }

    public void setShopCar(ShopCar shopCar) {
        this.shopCar = shopCar;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
