<%@ page language="java" contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/login">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="提交"/>
</form>
${t}
${f}
</body>
</html>
