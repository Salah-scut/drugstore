package com.thomsonxu.drugstore.entity;

public class Employee {
    private String employee_id;
    private String employee_name;
    private String password;
    private String email;
    private Integer job_id;
    private Integer department_id;

    public Employee(String employee_id, String employee_name, String password, String email, Integer job_id, Integer department_id) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.password = password;
        this.email = email;
        this.job_id = job_id;
        this.department_id = department_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }
}
