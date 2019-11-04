package com.itdr.pojo;

import java.util.Date;

/**
 * ClassName: Users
 * 日期: 2019/10/21 11:19
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Users {
    private Integer id;
    private String uphone;
    private String upsd;
    private String uemail;
    private Integer uage;
    private String usex;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUpsd() {
        return upsd;
    }

    public void setUpsd(String upsd) {
        this.upsd = upsd;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uphone='" + uphone + '\'' +
                ", upsd='" + upsd + '\'' +
                ", uemail='" + uemail + '\'' +
                ", uage=" + uage +
                ", usex='" + usex + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
