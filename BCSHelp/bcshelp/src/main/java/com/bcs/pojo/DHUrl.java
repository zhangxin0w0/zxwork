package com.bcs.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DHUrl {
    private Integer id;

    private String urlname;

    private String urladdress;

    private String urldescribe;

    private Integer cid;

    private Date createTime;

    private Date updateTime;


}