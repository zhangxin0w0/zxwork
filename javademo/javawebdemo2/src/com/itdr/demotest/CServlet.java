package com.itdr.demotest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/3 15:18
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet(name = "CServlet",value = "/c")
public class CServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入C中");
        response.sendRedirect("/b");
    }
}
