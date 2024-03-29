package com.thomsonxu.drugstore.servlet;

import com.thomsonxu.drugstore.entity.Drug;
import com.thomsonxu.drugstore.service.ShowDrugService;
import com.thomsonxu.drugstore.service.impl.ShowDrugServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowDrugServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShowDrugService showDrugService = new ShowDrugServiceImpl();
        List<Drug> list = showDrugService.showDrugservice();
        req.setAttribute("allDrugList",list);
        req.setAttribute("employee_name",req.getParameter("employee_name"));
        String job_id = req.getParameter("job_id");
        req.setAttribute("job_id",job_id);
        req.getRequestDispatcher(String.format("/showDrug%s.jsp",job_id)).forward(req,resp);
    }
}
