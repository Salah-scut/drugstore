<%--
  Created by IntelliJ IDEA.
  User: TomSalah
  Date: 2021/12/7
  Time: 14:39
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
    <title>药品信息</title>
</head>
<style>div{text-align: center}</style>
<style>table{text-align: center}</style>
<body>
    <div>
        <h1>药品信息</h1>
        <a href="updateInfo.jsp?name=${requestScope.employee_name}&type=1">修改个人资料</a><br>
        <a href="login.jsp">返回登录</a><hr>
    </div>
<form action="SelectDrugServlet" method="post" style="padding-top: -700px;">
    <div>
        药品编号：<input type="text" name="drug_id" value=""><br><br>
    </div>
    <div>
        药品名称：<input type="text" name="drug_name" value=""><br><br>
    </div>
    <div>
        生产厂家：<input type="text" name="manufacturer" value=""><br><br>
    </div>
    <input type="hidden" name="job_id" value="3">
    <div>
    <input type="submit" value="查询" name="query">
        <br><br>
    </div>
    <table border="1" style="margin:auto;">
        <tr>
            <td>药品编号</td>
            <td>药品名</td>
            <td>生产单位</td>
            <td>价格</td>
        </tr>

        <c:forEach items="${allDrugList}" var="record">
            <tr>
                <td>${record.drug_id}</td>
                <td>${record.drug_name}</td>
                <td>${record.manufacturer}</td>
                <td>${record.price}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
