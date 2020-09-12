<%--
  Created by IntelliJ IDEA.
  User: Windows10
  Date: 2020/8/6
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/jq/jquery-3.4.1.min.js"></script>
    <script>
        function an() {
           $.ajax(
               {
                   url:"${pageContext.request.contextPath}/a1",
                   data:{"name":$("#username").val()},
                   success:function (data) {
                       alert(data);
                   }
               }
           )
        }
    </script>
</head>
<body>
用户名：<input type="text" id="username" onblur="an()">
</body>
</html>
