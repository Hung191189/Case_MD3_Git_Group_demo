package com.example.case_md_03.service.user;

import com.example.case_md_03.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
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
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from user");){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idUser");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String password = rs.getString("password");
                int status = rs.getInt("status");
                userList.add(new User(id, name, age, email, address, password, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }


    @Override
    public void add(User user) throws SQLException {

    }

    @Override
    public User findById(int id) {
        User user = new User();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from user where idUser = ?");) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idUser = rs.getInt("idUser");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String password = rs.getString("password");
                int status = rs.getInt("status");
                user = new User(idUser, name, age, email, address, password, status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean update(User user) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }
}
