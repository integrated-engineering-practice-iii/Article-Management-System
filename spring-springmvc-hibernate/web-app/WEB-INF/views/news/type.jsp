<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻</title>
</head>
<body>
<jsp:include page="../util/head.jsp"/>
    <table>
        <thead>
            <th>序号</th>
            <th>标题</th>
            <th>时间</th>
            <th>详情</th>
        </thead>
        <tbody>
            <c:forEach var="news" items="${newsList}" varStatus="index">
                <tr>
                    <td>${index.count}</td>
                    <td>${news.title}</td>
                    <td>${news.date}</td>
                    <td><a href="/news/detail/${news.id}">详情</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
<a href="/news/type/${type}?page=${page>1?page-1:1}">上一页</a><a href="/news/type/${type}?page=${page+1}">下一页</a>
</body>
</html>
