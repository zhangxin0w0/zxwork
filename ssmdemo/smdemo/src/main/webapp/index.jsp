<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2019/11/11
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/portal/user/one.do" method="post">
    <input type="text" name="uname" placeholder="请输入查询的用户名称">
    <input type="submit" value="提交">
</form>

<form action="/portal/reply/getone.do" method="post">
    <input type="text" name="id" placeholder="请输入查询的回复内容ID">
    <input type="submit" value="提交">
</form>
</body>
</html>
