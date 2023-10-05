package com.example.case_md_03.service.posts;

import com.example.case_md_03.model.Posts;
import com.example.case_md_03.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostServiceImpl implements PostsService{
    protected Connection getConnection() {
        Connection connection = null;
        try {
            java.lang.Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/casemd3?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List<Posts> findAll() {
        List<Posts> postsList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from posts");){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idPosts = rs.getInt("idPosts");
                String titlePosts = rs.getString("titlePosts");
                String content = rs.getString("content");
                int status = rs.getInt("status");
                Date datePosts = rs.getDate("datePosts");
                int idUser = rs.getInt("idUser");
                int idCategory = rs.getInt("idCategory");
                postsList.add(new Posts(idPosts, titlePosts, content, status, datePosts, idUser, idCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postsList;
    }

    @Override
    public void add(Posts posts) throws SQLException {

    }

    @Override
    public Posts findById(int id) {
        return null;
    }

    @Override
    public boolean update(Posts posts) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public List<Posts> findByName(String name) {
        return null;
    }
}
