package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @WebServlet表示当前类是Servlet类，tomcat
 * 会基于反射来实例化所有的Servlet对象，处理请求
 * 时，根据请求路径找到对应的服务路径相关联的Servlet，
 * 调用Servlet对象的doXXX方法来处理请求和返回响应
 *
 * 注意事项：
 * 1. 路径必须是/开头
 * 2. 多个服务路径不能重复
 *
 * 开发流程：
 * 1. 使用@WebServlet+路径
 * 2. 继承HttpServlet
 * 3. 重写doXXX方法，通过request解析请求，response返回响应
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //前三段都是基本固定的写法
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        // 现在定义的变量是固定，以后从其他地方获取，就是动态
        String name = "李四";

        //设置响应http数据中，body的内容
        PrintWriter pw = resp.getWriter();
        pw.println("欢迎你，"+name);
        pw.println("<a href='hello'>本页面</a>");
    }
}
