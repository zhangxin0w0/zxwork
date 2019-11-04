package com.itdr.pojo;

import java.util.Date;

/**
 * ClassName: Category
 * 日期: 2019/11/4 9:36
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Category {
    private Integer id;
    private String cname;
    private Integer fid;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
        return "Category{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", fid=" + fid +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
