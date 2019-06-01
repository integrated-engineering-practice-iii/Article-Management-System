<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改新闻</title>
</head>
<body>
<jsp:include page="../util/head.jsp"/>
<form action="/news/updateNews" method="post">
    <input type="hidden" name="id" value="${news.id}"/>
    <input type="text" name="title" value="${news.title}"><br/>
    <input type="hidden" name="userId" value="${user.id}"><br/>
    <select name="type">
        <option value="国内">国内</option>
        <option value="国际">国际</option>
        <option value="军事">军事</option>
        <option value="财经">财经</option>
        <option value="娱乐">娱乐</option>
        <option value="体育">体育</option>
    </select><br/>
    <input type="text" name="context" multiple="multiple" value="${news.context}"/><br/>
    <input type="hidden" name="display" value="true"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
