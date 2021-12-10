package com.thomsonxu.drugstore.entity;

public class Department {
    private Integer department_id;
    private String department_name;
    private String address;
    private String manager_id;
    private String manager_name;

    public Department(Integer department_id, String department_name, String address, String manager_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.address = address;
        this.manager_id = manager_id;
    }

    public Department(Integer department_id, String department_name, String address, String manager_id, String manager_name) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.address = address;
        this.manager_id = manager_id;
        this.manager_name = manager_name;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
}
