package com.thomsonxu.drugstore.entity;

public class Employee {
    private String employee_id;
    private String employee_name;
    private String password;
    private String email;

    public Employee(String employee_id, String employee_name, String password, String email) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.password = password;
        this.email = email;
    }
}
