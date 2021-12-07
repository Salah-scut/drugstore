package com.thomsonxu.drugstore.servlet;

import com.thomsonxu.drugstore.entity.Employee;
import com.thomsonxu.drugstore.service.LoginService;
import com.thomsonxu.drugstore.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employee_id = req.getParameter("employee_id");
        String password = req.getParameter("password");
        LoginService loginService = new LoginServiceImpl();
        Employee employee = loginService.login(employee_id,password);
        if (employee != null) {
            req.setAttribute("employee",employee);
            req.setAttribute("employee_name",employee.getEmployee_name());
            // 重定向到对应职务的页面
            req.getRequestDispatcher(String.format("/main%d.jsp", employee.getJob_id())).forward(req,resp);
        } else {
            System.out.println("账户或密码错误！");
            resp.sendRedirect("login.jsp");
        }
    }
}
