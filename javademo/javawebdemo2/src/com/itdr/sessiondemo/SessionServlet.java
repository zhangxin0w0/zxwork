package com.itdr.sessiondemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/6 14:16
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet(name = "SessionServlet",value = "/session")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session);

        HttpSession session1 = request.getSession();
        System.out.println(session1);

        session1.invalidate();
    }
}
