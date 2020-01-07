package com.itdr.controller;

import com.itdr.pojo.Mood;
import com.itdr.service.MoodService;
import com.itdr.service.impl.MoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: MoodController
 * 日期: 2020/1/7 19:23
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebServlet("/moods/*")
public class MoodController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        MoodService mod = new MoodServiceImpl();
        Mood m = mod.selectMood(id);
        request.setAttribute("mood",m);
        request.getRequestDispatcher("moods.jsp").forward(request,response);

        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");
        if(split[split.length -1].equals("add")){
            add();
        }
        
    }

    private void add(){}
}
