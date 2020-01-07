package com.itdr.pojo;

/**
 * ClassName: Mood
 * 日期: 2020/1/7 19:15
 *
 * @author Air张
 * @since JDK 1.8
 */
public class Mood {
    private Integer id;
    private Integer uid;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
