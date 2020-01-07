<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2020/1/7
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>心情设置</title>
    <style>
        #dd{
            height: 300px;
            border: 1px seagreen solid;
        }
    </style>
</head>
<body>
<%--这是查询数据的--%>
<div id="dd">
    <form action="/moods" method="get">
        <input type="text" placeholder="请输入查询的id" name="id">
        <input type="submit" value="查询">
    </form>
    <c:if test="${not empty mood}">
        <p>用户心情</p>
        <p>${mood.content}</p>
    </c:if>
    <c:if test="${empty mood}">
        <p>找不到该心情!</p>
    </c:if>
</div>




<table>
    <tr>
        <th>序号</th>
        <th>用户id</th>
        <th>心情内容</th>
    </tr>

</table>
</body>
</html>
