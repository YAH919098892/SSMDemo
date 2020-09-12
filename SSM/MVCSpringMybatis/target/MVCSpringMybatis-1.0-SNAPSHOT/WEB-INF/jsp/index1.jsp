<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  accept-charset="UTF-8" method="get" action="${pageContext.request.contextPath}/all">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="提交jsp"/>
</form>
</body>
</html>