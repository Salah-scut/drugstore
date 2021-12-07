package com.thomsonxu.drugstore.service.impl;

import com.thomsonxu.drugstore.entity.Employee;
import com.thomsonxu.drugstore.service.LoginService;
import com.thomsonxu.drugstore.util.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServiceImpl implements LoginService {
    @Override
    public Employee login(String employee_id, String password) {
        Employee employee = null;
        DBconnection.init();
        ResultSet resultSet = DBconnection.login(employee_id,password);
        try {
            while (resultSet.next()) {
                //防止用"xxx or 1 = 1"这样的密码登录
                if (resultSet.getString("employee_id").equals(employee_id) && resultSet.getString("password").equals(password))
                    employee = new Employee(resultSet.getString("employee_id"),
                            resultSet.getString("employee_name"),
                            resultSet.getString("password"),
                            resultSet.getString("email"),
                            resultSet.getInt("job_id"),
                            resultSet.getInt("department_id"));
                }
            }
        catch (SQLException sqlException) {
                sqlException.printStackTrace();
        }
        DBconnection.closeConnection();
        return employee;
    }
}
