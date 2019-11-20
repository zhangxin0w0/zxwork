<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2019/8/20
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE"/>
    <title>内容列表页面</title>
    <link href="${pageContext.request.contextPath}/css/all.css" rel="stylesheet" type="text/css"/>
</head>
<body style="background: #e1e9eb;">
<form action="" id="mainForm" method="post">
    <div class="right">
        <div class="current">
            当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">
            内容管理</a> &gt; 内容列表
            <div style="float: right"><a href="${pageContext.request.contextPath}/index.jsp">回到首页</a></div>
        </div>
        <div class="rightCont">
            <p class="g_title fix">内容列表
                <a class="btn03" href="${pageContext.request.contextPath}/add.jsp">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a class="btn03" href="#">删 除</a>
            </p>
            <table class="tab1">
                <tbody>
                <tr>
                    <td width="90" align="right">关键词：</td>
                    <td>
                        <input type="text" class="allInput" value=""/>
                    </td>
                    <td width="90" align="right">模糊字：</td>
                    <td>
                        <input type="text" class="allInput" value=""/>
                    </td>
                    <td width="85" align="right"><input type="submit" class="tabSub" value="查 询"/></td>
                </tr>
                </tbody>
            </table>
            <div class="zixun fix">
                <table class="tab2" width="100%">
                    <tbody>
                    <tr>
                        <th><input type="checkbox" id="all" onclick="#"/></th>
                        <th>序号</th>
                        <th>关键词</th>
                        <th>模糊字</th>
                        <th>回复内容</th>
                        <th>分类标签</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${pageinfo.list}" var="reply">
                        <tr>
                            <td><input type="checkbox"/></td>
                            <td>${reply.id}</td>
                            <td>${reply.keyword}</td>
                            <td>${reply.words}</td>
                            <td>${reply.reply}</td>
                            <td>${reply.cid}</td>
                            <td>
                                <a href="#">修改</a>&nbsp;&nbsp;&nbsp;
                                <a href="/index/deleteOne.do?id=${reply.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
                <div class='page fix'>
                    共 <b>${pageinfo.total}</b> 条
                    <a href='###' class='first'>首页</a>
                    <a href='###' class='pre'>上一页</a>
                    当前第<span>${pageinfo.navigateFirstPage}/${pageinfo.pages}</span>页
                    <a href='###' class='next'>下一页</a>
                    <a href='###' class='last'>末页</a>
                    跳至&nbsp;<input type='text' value='1' class='allInput w28'/>&nbsp;页&nbsp;
                    <a href='###' class='go'>GO</a>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
