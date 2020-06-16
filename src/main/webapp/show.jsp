<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>


<p id="p1">查询的数据:
    ID->${topic.id}<br>
    名字->${topic.name}<br>
    详情->${topic.details}<br>
</p>
<style>
    #p1 {
        color: red;
    }
</style>


<br/>
<%
    out.println("你的 IP 地址 " + request.getRemoteAddr());

%>
<br/>
</body>
</html>
