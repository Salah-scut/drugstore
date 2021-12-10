package com.thomsonxu.drugstore.service.impl;

import com.thomsonxu.drugstore.entity.Department;
import com.thomsonxu.drugstore.service.ShowDepartmentService;
import com.thomsonxu.drugstore.util.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowDepartmentServiceImpl implements ShowDepartmentService {
    @Override
    public List<Department> showDepartmentService() {
        List<Department> list = new ArrayList<>();
        try {
            DBconnection.init();
            ResultSet resultSet = DBconnection.selectAllDepartments();
            while (resultSet.next())
                list.add(new Department(resultSet.getInt("department_id"),
                        resultSet.getString("department_name"),
                        resultSet.getString("address"),
                        resultSet.getString("manager_id"),
                        resultSet.getString("manager_name")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DBconnection.closeConnection();
        return list;
    }
}
