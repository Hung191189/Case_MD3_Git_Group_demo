package com.example.case_md_03.model;

import java.util.Date;

public class Posts {
    private int idPosts;
    private String titlePosts;
    private String content;
    private int status;
    private Date datePosts;
    private int idUser;
    private int idCategory;

    public Posts() {
    }

    public Posts(int idPosts, String titlePosts, String content, int status, Date datePosts, int idUser, int idCategory) {
        this.idPosts = idPosts;
        this.titlePosts = titlePosts;
        this.content = content;
        this.status = status;
        this.datePosts = datePosts;
        this.idUser = idUser;
        this.idCategory = idCategory;
    }

    public int getIdPosts() {
        return idPosts;
    }

    public void setIdPosts(int idPosts) {
        this.idPosts = idPosts;
    }

    public String getTitlePosts() {
        return titlePosts;
    }

    public void setTitlePosts(String titlePosts) {
        this.titlePosts = titlePosts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDatePosts() {
        return datePosts;
    }

    public void setDatePosts(Date datePosts) {
        this.datePosts = datePosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
}
