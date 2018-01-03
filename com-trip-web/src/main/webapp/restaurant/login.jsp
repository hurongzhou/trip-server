<%--
  Created by IntelliJ IDEA.
  User: hurong
  Date: 2018/1/3
  Time: 下午5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #form-div{
            margin-left: 530px;
            margin-top: 200px;
        }
        #txtUserName{
            border-radius: 2px;
            width: 170px;
            height: 30px;
        }
        #TextBox2{
            border-radius: 5px;
            width: 170px;
            height: 30px;
        }
        #login{
            width: 60px;
            height: 45px;
        }
        #re{
            width: 60px;
            height: 65px;
        }
    </style>
</head>
<body>
<div id="form-div">
    <form id="form1" action="/restaurant/login.json" method="post">
        <p>用户名：<input name="loginName" type="text" id="txtUserName" tabindex="1" size="15" value=""/></p>
        <p>密　码：<input name="password" type="password" id="TextBox2" tabindex="2" size="16" value=""/></p>
        <p><input id="login" type="submit" value="登录">&nbsp;<input id="re" type="reset" value="重置"></p>
    </form>
</div>
</body>
</html>
