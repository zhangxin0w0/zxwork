package com.bcs.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Category {
    private Integer id;

    private String cname;

    private Integer fid;

    private Date createTime;

    private Date updateTime;

}