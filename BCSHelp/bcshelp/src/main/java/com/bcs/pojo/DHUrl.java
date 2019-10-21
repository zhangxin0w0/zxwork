package com.bcs.pojo;

import java.util.Date;

public class DHUrl {
    private Integer id;

    private String urlname;

    private String urladdress;

    private String urldescribe;

    private Integer cid;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname == null ? null : urlname.trim();
    }

    public String getUrladdress() {
        return urladdress;
    }

    public void setUrladdress(String urladdress) {
        this.urladdress = urladdress == null ? null : urladdress.trim();
    }

    public String getUrldescribe() {
        return urldescribe;
    }

    public void setUrldescribe(String urldescribe) {
        this.urldescribe = urldescribe == null ? null : urldescribe.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}