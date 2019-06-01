<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
    <jsp:include page="../util/head.jsp"/>
    <form action="/user/update" method="post">
        <input type="hidden" name="id" value="${user.id}"/>
        用户名：<input type="text" name="name" value="${user.name}"/><br/>
        密码：<input type="text" name="password"/><br/>
        确认密码：<input type="text" name="password2"/><br/>
        电话：<input type="text" name="phone" value="${user.phone}"/><br/>
        <input type="submit" value="regist"/>
    </form>
</body>
</html>
