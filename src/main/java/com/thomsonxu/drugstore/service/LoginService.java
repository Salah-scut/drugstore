package com.thomsonxu.drugstore.service;

import com.thomsonxu.drugstore.entity.Employee;

public interface LoginService {
    public Employee login(String employee_id, String password);
}
