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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<body>
<h2>添加员工</h2>
<form action="${pageContext.request.contextPath}/emp/addEmp">
    员工名称：<input type="text" name="ename"><br>
    员工性别：<input type="radio" value="男" name="esex" checked>男
            <input type="radio" value="女" name="esex" >女<br/>
    员工年龄：<input type="text" name="eage"><br/>
    员工电话: <input type="text" name="ephone">
    选择部门: <select name="edno" id="sele">
                <option value="0">请选择</option>
             </select>
    <input type="submit" value="添加">
</form>
<a href="${pageContext.request.contextPath}/main.jsp">返回主页</a>
</body>
</html>
<script>
    $(function(){
        $.ajax({
            url : "${pageContext.request.contextPath}/dept/findDept",
            type : "post",
            success : function (data) {
                if(data.code == 500) {
                    alert(data.message);
                }else {
                    console.log(data);
                    $.each(data.obj,function(i,v){
                        var option="<option value='"+v.dno+"'>"+v.dname+"</option>"
                        $("#sele").append(option);
                    })
                }
            }
        });

    });
</script>
