package org.example.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
    private static final MysqlDataSource DS = new MysqlDataSource();
    static {
        //((MysqlDataSource)DS).setURL("");
        DS.setURL("jdbc:mysql://location:3306/servlet_blog");
        DS.setUser("root");
        DS.setPassword("4026");
        DS.setUseSSL(false);
    }
    public static Connection getConnection() throws SQLException {
        return DS.getConnection();
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}
