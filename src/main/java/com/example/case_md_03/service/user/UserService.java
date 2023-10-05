package com.example.case_md_03.service.user;


import com.example.case_md_03.model.User;
import com.example.case_md_03.service.GenericService;

import java.sql.SQLException;

public interface UserService extends GenericService<User> {
    void add(User user) throws SQLException;
}
