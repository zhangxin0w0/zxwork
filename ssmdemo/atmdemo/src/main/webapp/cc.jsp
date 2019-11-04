<%--
  Created by IntelliJ IDEA.
  User: 84378
  Date: 2019/10/31
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text" id="u">
<input type="text" id="p">
<input type="button" onclick="toback()">

</body>
<script src="jquery-3.3.1.js"></script>
<script>
    function toback() {
        $.ajax({
            url: "show.do",
            type: "POST",
            data: {u:"zhangxin",p:123},
            dataType: "json",
            success: function (data) {

            },
            error: function (err) {
                console.log(err.statusText);
                console.log('异常');
            }
        });
    }
</script>
</html>
