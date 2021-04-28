package org.example.servlet;

import org.example.dao.ArticleDAO;
import org.example.model.Article;
import org.example.model.JSONResponse;
import org.example.model.User;
import org.example.util.DBUtil;
import org.example.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/articleAdd")
public class ArticleAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        JSONResponse json = new JSONResponse();
        try{
            Article a=JSONUtil.deserialize(
                    req.getInputStream(),
                    Article.class);
            HttpSession session = req.getSession();
            User user = (User) session.getAttribute("user");
            List<Article> articles = ArticleDAO.query(user.getId());

            json.setSuccess(true);
            json.setData(false);
        }catch(Exception e)


        }
    }
    public static int insert(Article a) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            //1.
            c = DBUtil.getConnection();
            //2.select *工作中不允许，要把查询列写全
            String sql = "insert into article(title,content,user_id)values ";
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
