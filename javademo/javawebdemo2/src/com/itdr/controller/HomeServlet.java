package com.itdr.controller;

import com.itdr.pojo.Stu;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.servlet.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: HomeServlet
 * 日期: 2019/12/31 10:17
 *
 * @author Air张
 * @since JDK 1.8
 */
public class HomeServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=UTF-8");
        System.out.println("这是处理请求的方法");
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
        try {
            List<Stu> li = qr.query("select * from stu ",new BeanListHandler<Stu>(Stu.class));
            servletRequest.setAttribute("users",li);
            servletRequest.getRequestDispatcher("home.jsp").forward(servletRequest,servletResponse);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
