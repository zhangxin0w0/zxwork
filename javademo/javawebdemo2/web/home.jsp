<%@ page import="org.apache.commons.dbutils.QueryRunner" %>
<%@ page import="com.mchange.v2.c3p0.ComboPooledDataSource" %>
<%@ page import="org.apache.commons.dbutils.handlers.BeanHandler" %>
<%@ page import="com.itdr.pojo.Stu" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
    Stu t = qr.query("select * from stu where id = 13", new BeanHandler<Stu>(Stu.class));
    response.setContentType("text/html;charset=UTF-8");
%>


<html>
<head>

</head>
<body>
<h1>这是我自己写的jsp页面</h1>
<p>
    <%="用户姓名：" + t.getName()%>
</p>
<p>
    <%=((List<Stu>) request.getAttribute("users")).size()%>
</p>
${not empty users}
<p>
    <c:if test="${not empty users}">
        <c:forEach items="${users}" var="u">
            <ul>
                <li>${u.id}=====${u.name}</li>
            </ul>
        </c:forEach>
</c:if>

</p>
</body>
</html>