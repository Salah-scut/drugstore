<%--
  Created by IntelliJ IDEA.
  User: TomSalah
  Date: 2021/11/30
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>div{text-align: center}</style>
<body>
    <form action="LoginServlet" method="post" style="padding-top: -700px;">
        <div>姓名：<input type="text" name="name" value=""><br><br></div>
        <div>密码：<input type="password" name="password" value=""><br><br></div>
        <div>
            <input type="submit" value="登录" name="login">&nbsp;&nbsp;&nbsp;
            <input type="reset" value="重置">
        </div>
    </form>
</body>
</html>
