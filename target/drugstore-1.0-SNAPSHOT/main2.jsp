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
%>
<html>
<head>
    <title>店长主页</title>
</head>
<body>
<style>div{text-align: center}</style>
<div>
    <h1>亲爱的<%=employee.getEmployee_name()%>店长，欢迎回来！</h1><hr>
    <a href="ShowDrugServlet?job_id=${2}&employee_name=${requestScope.employee_name}">查看药品信息</a><br>
    <a href="updateInfo.jsp">修改个人资料</a><br>
    <a href="login.jsp">返回登录</a>
</div>
</body>
</html>
