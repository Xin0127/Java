package org.example.servlet;

import org.example.util.DBUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/")
public class ArticleDetailServlet extends HttpServlet {
    Connection c = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try{
        //1.
        c = DBUtil.getConnection();
        //2.select *工作中不允许，要把查询列写全
        String sql = " ";
        ps = c.prepareStatement(sql);
        //3.替换占位符+执行sql
        ps.setString(1,a.getTitle());
        ps.setString(2,a.getContent());
        ps.setInt(3,a.getId( ));
        return ps.executeUpdate();
    }finally {
        DBUtil.close(c,ps,rs);
    }


}
