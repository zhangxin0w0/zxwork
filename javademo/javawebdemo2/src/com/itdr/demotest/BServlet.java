package com.itdr.demotest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/2 15:07
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet(name = "BServlet",value = "/b")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("获取到的请求信息："+request.getAttribute("meg"));
        String value = request.getParameter("key");
        System.out.println("这是宝箱密码："+value);
    }
}
