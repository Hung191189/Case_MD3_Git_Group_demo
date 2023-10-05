package com.example.case_md_03.model;

public class Image {
    private int idImage;
    private String url;
    private String titleImage;
    private int idPosts;
    private int status;

    public Image() {
    }

    public Image(int idImage, String url, String titleImage, int idPosts, int status) {
        this.idImage = idImage;
        this.url = url;
        this.titleImage = titleImage;
        this.idPosts = idPosts;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public int getIdPosts() {
        return idPosts;
    }

    public void setIdPosts(int idPosts) {
        this.idPosts = idPosts;
    }
}

