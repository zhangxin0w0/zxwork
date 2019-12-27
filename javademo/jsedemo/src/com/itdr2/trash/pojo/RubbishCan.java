package com.itdr2.trash.pojo;

/**
 * ClassName: RubbishCan
 * 日期: 2019/12/27 14:43
 *
 * @author Air张
 * @since JDK 1.8
 */
public class RubbishCan {
    private Integer id;
    private String rtype;
    private Integer rl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public Integer getRl() {
        return rl;
    }

    public void setRl(Integer rl) {
        this.rl = rl;
    }

    public void clRubbish(){
        System.out.println("垃圾桶可以处理垃圾");
    }
}
