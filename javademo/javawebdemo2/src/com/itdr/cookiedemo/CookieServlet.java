package com.itdr.cookiedemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/6 10:51
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet(name = "CookieServlet",value = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf8");

        System.out.println("请求进来了");

//        Cookie c = new Cookie("key","10min");
//        Cookie c2 = new Cookie("key2","18");
//        c.setMaxAge(10*60);
//        response.addCookie(c);
//        response.addCookie(c2);
//        c.setValue("20");

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("Idea-231f4017")){
                String value = cookie.getValue();
                System.out.println(value);
            }
        }

        response.getWriter().write("客户端收到请求了");
    }
}
