<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${news.title}</title>
</head>
<body>
<jsp:include page="../util/head.jsp"/>
${news.title}<br/>
${author}<br/>
${news.date}<br/>
${news.context}
</body>
</html>
