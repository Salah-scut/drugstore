<%@ page import="com.thomsonxu.drugstore.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: TomSalah
  Date: 2021/12/7
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    Employee employee = (Employee) request.getAttribute("employee");
%><html>
<head>
    <title>管理员主页</title>
</head>
<body>
<style>div{text-align: center}</style>
<div>
    <h1>亲爱的<%=employee.getEmployee_name()%>管理员，欢迎回来！</h1><hr>
    <a href="ShowEmployeeServlet?">查看职工表</a><br>
    <a href="ShowDepartmentServlet">查看门店表</a><br>
    <a href="login.jsp">返回登录</a>
</div>
</body>
</html>
