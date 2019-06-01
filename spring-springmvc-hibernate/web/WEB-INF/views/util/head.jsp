
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <style>
        li{
            display: inline;
        }
    </style>
    登录用户是：${user.name} <a href="/user/logout">退出</a><br/>
    <ul>
        <li><a href="/news/type/国内?page=1">国内</a></li>
        <li><a href="/news/type/国际?page=1">国际</a></li>
        <li><a href="/news/type/军事?page=1">军事</a></li>
        <li><a href="/news/type/财经?page=1">财经</a></li>
        <li><a href="/news/type/娱乐?page=1">娱乐</a></li>
        <li><a href="/news/type/体育?page=1">体育</a></li>
        <li><a href="/news/user?page=1">我的新闻</a> </li>
        <li><a href="/news/addNews">书写新闻</a></li>
        <li><a href="/user/update">修改个人信息</a></li>
    </ul>
    <br/>

</div>
