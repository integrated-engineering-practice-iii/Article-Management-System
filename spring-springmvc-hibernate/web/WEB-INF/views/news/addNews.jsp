<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加新闻</title>
</head>
<body>
<jsp:include page="../util/head.jsp"/>
    <form action="/news/addNews" method="post">
        标题：<input type="text" name="title"><br/>
        <input type="hidden" name="userId" value="${user.id}"><br/>
        类型：<select name="type">
            <option value="国内">国内</option>
            <option value="国际">国际</option>
            <option value="军事">军事</option>
            <option value="财经">财经</option>
            <option value="娱乐">娱乐</option>
            <option value="体育">体育</option>
        </select><br/>
        内容<input type="text" name="context" multiple="multiple"/><br/>
        <input type="hidden" name="display" value="true"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
