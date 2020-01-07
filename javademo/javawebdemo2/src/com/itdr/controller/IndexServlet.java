package com.itdr.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2019/12/30 15:25
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = "zhangxin";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(s.equals(username)){
            response.getWriter().write("ok");
        }else{
            response.getWriter().write("no");
        }
    }
}
