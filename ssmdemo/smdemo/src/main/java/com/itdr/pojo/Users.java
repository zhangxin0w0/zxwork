package com.itdr.pojo;

/**
 * ClassName: Users
 * 日期: 2019/11/11 8:50
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Users {
    private Integer id;
    private String uname;
    private String upsd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpsd() {
        return upsd;
    }

    public void setUpsd(String upsd) {
        this.upsd = upsd;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upsd='" + upsd + '\'' +
                '}';
    }
}
