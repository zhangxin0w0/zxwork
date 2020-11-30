package com.itdr.pojo;

/**
 * ClassName: DJ
 * 日期: 2020/11/9 16:14
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DJ {
    private Integer id;
    private String dname;
    private Integer dlv;
    private Integer dprice;
    private Integer dstock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getDlv() {
        return dlv;
    }

    public void setDlv(Integer dlv) {
        this.dlv = dlv;
    }

    public Integer getDprice() {
        return dprice;
    }

    public void setDprice(Integer dprice) {
        this.dprice = dprice;
    }

    public Integer getDstock() {
        return dstock;
    }

    public void setDstock(Integer dstock) {
        this.dstock = dstock;
    }
}
