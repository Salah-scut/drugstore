package com.thomsonxu.drugstore.servlet;

import com.thomsonxu.drugstore.entity.Employee;
import com.thomsonxu.drugstore.service.ShowEmployeeService;
import com.thomsonxu.drugstore.service.impl.ShowEmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShowEmployeeService showEmployeeService = new ShowEmployeeServiceImpl();
        List<Employee> list = showEmployeeService.showEmployeeService();
        req.setAttribute("allDrugList",list);
        req.setAttribute("employee_name",req.getParameter("employee_name"));
        String job_id = req.getParameter("job_id");
        req.getRequestDispatcher("/showEmployee.jsp").forward(req,resp);
    }
}
