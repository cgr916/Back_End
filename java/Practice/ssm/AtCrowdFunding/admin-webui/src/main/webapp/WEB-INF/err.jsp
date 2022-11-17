<%--
  Created by IntelliJ IDEA.
  User: Chan_GR
  Date: 2022/7/16
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<h1 style="margin: 20px auto;">!!!出错了！！！</h1>
<p>${requestScope.exception.message}</p>
</body>
</html>
