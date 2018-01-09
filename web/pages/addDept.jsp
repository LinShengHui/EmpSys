<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>添加部门</h2>
<form action="${pageContext.request.contextPath}/dept/addDept">
    部门名称：<input type="text" name="dname">
    <input type="submit" value="添加">
</form>
<a href="${pageContext.request.contextPath}/main.jsp">返回主页</a>
</body>
</html>
