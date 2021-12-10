package com.thomsonxu.drugstore.servlet;

import com.thomsonxu.drugstore.entity.Employee;
import com.thomsonxu.drugstore.service.DeleteDrugService;
import com.thomsonxu.drugstore.service.ShowEmployeeService;
import com.thomsonxu.drugstore.service.impl.DeleteDrugServiceImpl;
import com.thomsonxu.drugstore.service.impl.ShowEmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteDrugServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeleteDrugService deleteDrugService = new DeleteDrugServiceImpl();
        deleteDrugService.deleteDrugService(req.getParameter("drug_id"));
        req.setAttribute("employee_name",req.getParameter("employee_name"));
        req.setAttribute("job_id",req.getParameter("job_id"));
        req.getRequestDispatcher("/ShowDrugServlet").forward(req,resp);
    }
}
