<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>

  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
  <body>
  <form id="f" >
    用户名: <input type="text" name="name"/><br/>
    密码 : <input type="password" name="password"/>
    <input type="button" value="go" id="button"/>
  </form>
  </body>
</html>

<script>
    $(function(){
        $("#button").on("click",function(){
            var params = $("#f").serialize();
            $.ajax({
                url : "user/login",
                type : "post",
                data : params,
                success : function (data) {
                    if(data.code == 500) {
                        alert(data.message);
                    }else {
                        alert("登陆成功");
                        window.location.href="main.jsp"
                    }
                }
            });
        });
    });
</script>
