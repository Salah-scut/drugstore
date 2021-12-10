package com.thomsonxu.drugstore.servlet;

import com.thomsonxu.drugstore.entity.Department;
import com.thomsonxu.drugstore.service.ShowDepartmentService;
import com.thomsonxu.drugstore.service.impl.ShowDepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowDepartmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShowDepartmentService showDepartmentService = new ShowDepartmentServiceImpl();
        List<Department> list = showDepartmentService.showDepartmentService();
        req.setAttribute("allDrugList",list);
        req.setAttribute("employee_name",req.getParameter("employee_name"));
        String job_id = req.getParameter("job_id");
        req.getRequestDispatcher("/showDepartment.jsp").forward(req,resp);
    }
}
