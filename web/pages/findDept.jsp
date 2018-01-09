<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<body>

<h2>部门</h2>
<table border="1" id="tab">
    <tr>
        <td>编号</td>
        <td>部门名称</td>
    </tr>

</table>
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
                            var tr = "<tr><td>"+v.dno+"</td><td>"+v.dname+"</td></tr>"
                            $("#tab").append(tr);
                        })
                    }
                }
            });

    });
</script>