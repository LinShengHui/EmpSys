package mgy.util;

import query.SQLExecutorException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost:3306/study";
    private final static String user = "root";
    private final static String pwd = "123456";
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new SQLExecutorException("Mysql driver class not found",e);
        }
    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            throw new SQLExecutorException("Get connection error",e);
        }
    }

    public static void main(String[] args) {
        Connection conn = ConnUtil.getConnection();
        System.out.println(conn);
    }
}
