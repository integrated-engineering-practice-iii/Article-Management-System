<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="/user/login" method="post">
        用户名：<input type="text" name="name"/><br/>
        密码：<input type="password" name = "password"/><br/>
        <input type="submit" value="登录"/> <a href="/user/regist">注册</a>
    </form>
    ${info}
</body>
</html>
