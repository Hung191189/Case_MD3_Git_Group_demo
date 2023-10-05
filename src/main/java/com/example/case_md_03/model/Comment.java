package com.example.case_md_03.model;

import java.util.Date;

public class Comment {
    private int idComment;
    private String content;
    private Date dateComment;
    private int idUser;
    private int idPosts;
    private int status;

    public Comment() {
    }

    public Comment(int idComment, String content, Date dateComment, int idUser, int idPosts, int status) {
        this.idComment = idComment;
        this.content = content;
        this.dateComment = dateComment;
        this.idUser = idUser;
        this.idPosts = idPosts;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPosts() {
        return idPosts;
    }

    public void setIdPosts(int idPosts) {
        this.idPosts = idPosts;
    }
}

