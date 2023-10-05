package com.example.case_md_03.controller;

import com.example.case_md_03.model.Posts;
import com.example.case_md_03.model.User;
import com.example.case_md_03.service.posts.PostServiceImpl;
import com.example.case_md_03.service.posts.PostsService;
import com.example.case_md_03.service.user.UserService;
import com.example.case_md_03.service.user.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "postsServlet", value = "/PostsServlet")
public class PostsServlet extends HttpServlet {
    PostsService postsService = new PostServiceImpl();
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                showListPost(request, response);
        }
        request.getRequestDispatcher("posts/listPosts.jsp").forward(request, response);
    }
    private void showListPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Posts> postsList = postsService.findAll();
        List<User> userList = findAllUser(postsList);
        request.setAttribute("postsList", postsList);
        request.setAttribute("userList", userList);
        request.getRequestDispatcher("posts/listPosts.jsp").forward(request, response);
    }
    List<User> findAllUser(List<Posts> postsList) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < postsList.size(); i++) {
            User user = userService.findById(postsList.get(i).getIdCategory());
            list.add(user);
        }
        return list;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}