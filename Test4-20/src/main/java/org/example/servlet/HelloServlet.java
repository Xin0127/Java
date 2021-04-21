package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *注意事项：
 * 1.路径必须/开头
 * 2.多个路径不能重复
 *
 * 开发流程：
 * 1.使用@WebServlet+路径
 * 2.继承HttpServlet
 * 3.重写doXXX方法，通过request解析请求，response返回响应
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        String name = "李四";
        PrintWriter pw = resp.getWriter();
        pw.println("欢迎你，"+name);
        pw.println("<a href='hello'>本页面</a>");
    }
}
