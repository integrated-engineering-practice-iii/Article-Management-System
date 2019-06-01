<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻</title>
</head>
<body>
<jsp:include page="../util/head.jsp"/>
<h1>用户信息</h1>
    <table>
        <thead>
            <tr>
                <th>序号</th>
                <th>标题</th>
                <th>分类</th>
                <th>时间</th>
                <th>查看</th>
                <th>删除</th>
                <th>修改</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="news" items="${newsList}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${news.title}</td>
                    <td>${news.type}</td>
                    <td>${news.date}</td>
                    <td><a href="/news/detail/${news.id}">查看</a></td>
                    <td> <a href="/news/delete/${news.id}">删除</a></td>
                    <td> <a href="/news/updateNews/${news.id}">修改</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/news/user?page=${page>1?page-1:1}">上一页</a><a href="/news/user?page=${page+1}">下一页</a>
</body>
</html>
