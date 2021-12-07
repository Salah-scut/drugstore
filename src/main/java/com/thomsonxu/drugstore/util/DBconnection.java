package com.thomsonxu.drugstore.util;

import java.sql.*;

public class DBconnection {
    static private String url = "jdbc:mysql://localhost:3306/drugstore?serverTimezone=GMT%2B8&amp";
    static private String user = "root";
    static private String password = "1233";
    static private Connection connection = null;
    static private PreparedStatement statement = null;
    static private ResultSet resultSet = null;

    /**
     * SQL初始化
     */
    public static void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 关闭数据库连接
     */
    public static void closeConnection() {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 登录查询
     * @param employee_id
     * @param password
     * @return
     */
    public static ResultSet login(String employee_id, String password) {
        try {
            statement = connection.prepareStatement("select * from employees where employee_id = ? and password = ?");
            statement.setString(1,employee_id);
            statement.setString(2,password);
            resultSet = statement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public static ResultSet selectDrugs() {
        try {
            statement = connection.prepareStatement("select * from drugs where 1 = ?");
            statement.setString(1,"1");
            resultSet = statement.executeQuery();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return resultSet;
    }
}
