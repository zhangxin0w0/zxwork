package com.itdr.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: UserController
 * 日期: 2020/1/3 10:18
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("这是get请求");
        String username = request.getParameter("username");
        System.out.println("用户名：" + username);

        System.out.println("这是post请求");
        String psd = request.getParameter("psd");
        System.out.println("用户名：" + psd);

        response.getWriter().write("<h1>" + username + "</h1>");
        response.getWriter().write("<h1>" + psd + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
