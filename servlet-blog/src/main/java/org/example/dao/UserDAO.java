package org.example.dao;

import org.example.modle.User;
import org.example.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static User query(User input) throws SQLException {
        //1.创建数据库连接Connection
        Connection c = DBUtil.getConnection();
        //2.创建操作命令对象Statement
        String sql = "select * from user where username=? and password=?";
        PreparedStatement ps = c.prepareStatement(sql);

        //3.执行sql
        ps.setString(1,input.getUsername());
        ps.setString(2,input.getPassword());
        ResultSet rs = ps.executeQuery();

        User query = null;
        //4.如果是查询操作，处理结果集
        while(rs.next()){
            query = new User();
            query.setId(rs.getInt("id"));
            query.setUsername(input.getUsername());
            query.setPassword(input.getPassword());
            query.setNickname(rs.getString("nickname"));
            query.setSex(rs.getBoolean("sex"));
        }
        //5.释放资源
        return query;
    }
}
