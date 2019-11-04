package com.itdr.pojo;

import java.util.Date;

/**
 * ClassName: ReplyContent
 * 日期: 2019/11/4 9:34
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ReplyContent {
    private Integer id;
    private String keyword;
    private String words;
    private String reply;
    private Integer cid;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
        return "ReplyContent{" +
                "id=" + id +
                ", keyword='" + keyword + '\'' +
                ", words='" + words + '\'' +
                ", reply='" + reply + '\'' +
                ", cid=" + cid +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
