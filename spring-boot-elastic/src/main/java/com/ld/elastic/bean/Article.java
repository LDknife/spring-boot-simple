package com.ld.elastic.bean;

import io.searchbox.annotations.JestId;

/**
 * @author:ld
 * @create:2018-11-14 10:55
 * @description:
 */
public class Article {

    @JestId
    private Integer id;
    private String auther;
    private String title;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
