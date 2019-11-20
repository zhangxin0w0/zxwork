<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2019/8/20
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE"/>
    <title>内容列表页面</title>
    <link href="${pageContext.request.contextPath}/css/all.css" rel="stylesheet" type="text/css"/>
    <style>
        input {
            border: 2px salmon solid;
            height: 30px;
            width: 100px;
        }
    </style>
</head>
<body style="background: #e1e9eb;">
<form action="/index/addone.do" id="mainForm" method="post">

    <div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">内容管理</a> &gt; 增加内容</div>
    <div class="rightCont">
            <p class="g_title fix">增加内容
                <input type="submit" value="新增" class="btn03">
                <%--<a  href="#">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;--%>
            </p>
            <div class="zixun fix">
                <table class="tab2" width="100%">
                    <tbody>
                    <tr>
                        <th>关键词</th>
                        <th>模糊字</th>
                        <th>回复内容</th>
                        <th>分类标签</th>
                    </tr>
                    <tr>
                        <td>
                            <input type="text" placeholder="请输入关键词" name="keyword">
                        </td>
                        <td>
                            <input type="text" placeholder="请输入模糊字" name="words">
                        </td>
                        <td>
                            <input type="text" placeholder="请输入回复内容" name="reply">
                        </td>
                        <td>
                            <select name="cid">
                                <option>请选择分类标签</option>
                                <option value="1">默认回复</option>
                                <option value="2">自动回复</option>
                                <option value="3">关键词回复</option>
                                <option value="4">模糊字回复</option>
                            </select>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
    </div>
</form>
</body>
</html>
