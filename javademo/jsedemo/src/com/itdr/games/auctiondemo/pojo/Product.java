package com.itdr.games.auctiondemo.pojo;

import java.math.BigDecimal;

/**
 * ClassName: Product
 * 日期: 2019/12/3 19:34
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Product {
    private String pname;
    private BigDecimal price;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
