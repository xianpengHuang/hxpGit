package com.hxp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

//@WebServlet(name = "/login")
public class MyLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        Enumeration<String> headerNames = request.getHeaderNames();
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("method:" + method);
        System.out.println("URI:" + requestURI);
        System.out.println("URL:" + requestURL.toString());
        String lang1 = request.getParameter("box");//获取第一个
        String[] langs = request.getParameterValues("box");//获取同名参数的所有传入值，非覆盖
        System.out.println("lang1:" + lang1);
        for (String str : langs) {
            System.out.println("lang同名参数：" + str);
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("<h1>登陆成功<h1>");

    }
}
