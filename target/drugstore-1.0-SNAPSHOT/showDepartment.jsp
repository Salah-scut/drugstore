<%--
  Created by IntelliJ IDEA.
  User: TomSalah
  Date: 2021/12/9
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>门店信息</title>
</head>
<style>div{text-align: center}</style>
<style>table{text-align: center}</style>
<body>
<div>
    <h1>门店信息</h1>
    <a href="updateInfo.jsp?name=${requestScope.employee_name}&type=1">修改个人资料</a><br>
    <a href="login.jsp">返回登录</a><hr>
</div>
<form action="ShowDepartmentServlet" method="post" style="padding-top: -700px;">
    <div>
        药品编号：<input type="text" name="drug_id" value=""><br><br>
    </div>
    <div>
        药品名称：<input type="text" name="drug_name" value=""><br><br>
    </div>
    <div>
        生产厂家：<input type="text" name="manufacturer" value=""><br><br>
    </div>
    <div>
        <input type="submit" value="查询" name="query">
        <br><br>
    </div>
    <table border="1" style="margin:auto;">
        <tr>
            <td>门店编号</td>
            <td>门店名</td>
            <td>门店地址</td>
            <td>店长</td>
        </tr>

        <c:forEach items="${allDrugList}" var="record">
            <tr>
                <td>${record.department_id}</td>
                <td>${record.department_name}</td>
                <td>${record.address}</td>
                <td>${record.manager_name}</td>
                <td>
                    <a href="">发送邮件</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>