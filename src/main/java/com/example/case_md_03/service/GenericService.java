package com.example.case_md_03.service;

import java.sql.SQLException;
import java.util.List;

public interface GenericService<T> {
    List<T> findAll();
    void add(T t) throws SQLException;
    T findById(int id);
    boolean update(T t) throws SQLException;
    boolean delete(int id) throws SQLException;
    List<T> findByName(String name);
}

