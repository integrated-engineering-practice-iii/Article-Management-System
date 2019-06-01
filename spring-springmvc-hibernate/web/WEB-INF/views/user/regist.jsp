<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head>
<body>
    <form action="/user/regist" method="post">
        用户名：<input type="text" name="name"/><br/>
        密码：<input type="text" name="password"/><br/>
        确认密码：<input type="text" name="password2"/><br/>
        电话：<input type="text" name="phone"/><br/>
        <input type="submit" value="regist"/> <a href="/user/login">返回</a>
    </form>
${info}
</body>
</html>
