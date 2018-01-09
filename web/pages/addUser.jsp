<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>注册账号</h2>
<form action="${pageContext.request.contextPath}/user/addUser" method="post">
    用户名: <input type="text" name="name"/><br/>
    密码 : <input type="password" name="password"/>
    <input type="submit" value="注册">
</form>
</body>
</html>
