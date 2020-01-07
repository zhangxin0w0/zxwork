package com.itdr.demotest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/2 15:06
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet(name = "AServlet", value = "/a")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("key");
        System.out.println(value);
        request.setAttribute("meg", "这是打开宝箱的密码");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/b");
        requestDispatcher.forward(request, response);
    }
}
