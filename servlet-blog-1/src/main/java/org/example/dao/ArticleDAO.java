package org.example.dao;

import org.example.model.Article;
import org.example.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    public static List<Article> query(Integer id) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            //1.
            c = DBUtil.getConnection();
            //2.select *工作中不允许，要把查询列写全
            String sql = "select * from article where user_id=?";
            ps = c.prepareStatement(sql);
            //3.替换占位符+执行sql
            ps.setInt(1,id);
            rs = ps.executeQuery();
            //4.
            List<Article> articles = new ArrayList<>();
            while (rs.next()){
                //每一次遍历就是一行数据，每一行转换为一个对象
                Article a = new Article();
                //从当前行的结果集表头字段，获取值，设置到对象属性
                a.setId(rs.getInt("id"));
                a.setTitle(rs.getString("title"));
                a.setContent(rs.getString("content"));
                a.setViewCount(rs.getInt("view_count"));
                a.setUserId(id);
                Timestamp t=rs.getTimestamp("creat_time");
                if(t != null)
                    a.setCreateTime(new java.util.Date(t.getTime()));
                articles.add(a);
            }
            return articles;
        }finally {
            DBUtil.close(c,ps,rs);
        }
    }
}