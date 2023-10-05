package com.example.case_md_03.model;

public class Category {
    private int idCategory;
    private String name;
    private int status;

    public Category() {
    }

    public Category(int idCategory, String name, int status) {
        this.idCategory = idCategory;
        this.name = name;
        this.status = status;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

