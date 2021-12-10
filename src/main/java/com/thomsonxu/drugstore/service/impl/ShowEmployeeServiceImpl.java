package com.thomsonxu.drugstore.service.impl;

import com.thomsonxu.drugstore.entity.Employee;
import com.thomsonxu.drugstore.service.ShowEmployeeService;
import com.thomsonxu.drugstore.util.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowEmployeeServiceImpl implements ShowEmployeeService {
    @Override
    public List<Employee> showEmployeeService() {
        List<Employee> list = new ArrayList<>();
        try {
            DBconnection.init();
            ResultSet resultSet = DBconnection.selectAllEmployees();
            while (resultSet.next())
                list.add(new Employee(resultSet.getString("employee_id"),
                        resultSet.getString("employee_name"),
                        resultSet.getString("email"),
                        resultSet.getInt("job_id"),
                        resultSet.getInt("department_id")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DBconnection.closeConnection();
        return list;
    }
}
