<%--
  Created by IntelliJ IDEA.
  User: TomSalah
  Date: 2021/12/10
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String drug_id = request.getParameter("drug_id");
    String drug_name = request.getParameter("drug_name");
    String manufacturer = request.getParameter("manufacturer");
    String price = request.getParameter("price");
    String employee_name = request.getParameter("employee_name");
    String job_id = request.getParameter("job_id");
%>
<html>
<head>
    <title>更新或删除药品</title>
</head>
<style>div{text-align: center}</style>
<style>table{text-align: center}</style>
<body>
<div>
    <h1>更新或删除药品</h1>
</div>
<form action="ShowDrugServlet" method="post">
    <div>
        药品编号：<input type="text" name="drug_id" value="<%=drug_id%>"><br><br>
    </div>
    <div>
        药品名称：<input type="text" name="drug_name" value="<%=drug_name%>"><br><br>
    </div>
    <div>
        生产厂家：<input type="text" name="manufacturer" value="<%=manufacturer%>"><br><br>
    </div>
    <div>
        价格：<input type="text" name="price" value="<%=price%>"><br><br>
    </div>
    <input type="hidden" value="<%=employee_name%>" name="employee_name">
    <input type="hidden" value="<%=job_id%>" name="job_id">
    <div><input type="submit" value="修改"></div>
</form>

<form action="DeleteDrugServlet" method="post">
    <input type="hidden" value="<%=drug_id%>" name="drug_id">
    <input type="hidden" value="<%=employee_name%>" name="employee_name">
    <input type="hidden" value="<%=job_id%>" name="job_id">
    <div><input type="submit" value="删除"></div>
</form>
</body>
</html>
