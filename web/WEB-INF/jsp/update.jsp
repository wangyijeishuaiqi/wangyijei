<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/7
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="updateproduct" method="post">
    <input type="hidden" name="id" value="${product.id}">
    <input type="text" name="productname" value="${product.productname}">
    <input type="text" name="descs" value="${product.descs}">
    <input type="text" name="cid" value="${product.cid}">
    <input type="submit" name="tj" value="提交">
</form>
</body>
</html>
