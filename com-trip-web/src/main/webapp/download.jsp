<%--
  Created by IntelliJ IDEA.
  User: hurong
  Date: 2017/12/29
  Time: 下午2:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>download</title>
</head>
<body>
<form action="download.json" method="post" enctype="application/x-www-form-urlencoded">
    url：<input type="text" name="fileUrl"/>
    外键：<input type="text" name="foreignId">
    <input type="submit" value="Submit" />
</form>
</body>
</html>
