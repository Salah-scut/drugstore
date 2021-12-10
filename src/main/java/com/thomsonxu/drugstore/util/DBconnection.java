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

    /**
     * 查询所有药品
     * @return
     */
    public static ResultSet selectAllDrugs() {
        try {
            statement = connection.prepareStatement("select * from drugs");
            resultSet = statement.executeQuery();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return resultSet;
    }

    /**
     * 根据输入信息查询药品
     * @param info
     * @param info_type
     * @return
     */
    public static ResultSet selectDrugs(String info, int info_type) {
        String sql_string = null;
        try {
            switch (info_type) {
                case 1:
                    sql_string = "select * from drugs where drug_id like ?";
                    break;
                case 2:
                    sql_string = "select * from drugs where drug_name like ?";
                    break;
                case 3:
                    sql_string = "select * from drugs where manufacturer like ?";
                    break;
            }
            statement = connection.prepareStatement(sql_string);
            String ssss = "%"+info+"%";
            statement.setString(1,"%"+info+"%");

            resultSet = statement.executeQuery();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return resultSet;
    }

    /**
     * 查询所有职工
     * @return
     */
    public static ResultSet selectAllEmployees() {
        try {
            statement = connection.prepareStatement("select * from employees");
            resultSet = statement.executeQuery();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return resultSet;
    }

    /**
     * 查询所有门店
     * @return
     */
    public static ResultSet selectAllDepartments() {
        try {
            statement = connection.prepareStatement("select * from department_manager");
            resultSet = statement.executeQuery();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return resultSet;
    }

    public static void deleteDrug(String drug_id) {
        try {
            statement = connection.prepareStatement("delete from drugs where drug_id = ?");
            statement.setString(1,drug_id);
            statement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
