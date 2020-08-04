<%--
  Created by IntelliJ IDEA.
  User: xuemei
  Date: 2020/8/3
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录界面</title>
  </head>
  <body>
  <form action="./login" method="get">
   用户名： <input name="name" value=""/>
   密码： <input name="pass" value="" type="password"/>
   java： <input name="box" type="checkbox" value="Java"/>
   c# <input name="box" type="checkbox" value=".Net"/>
   C++ <input name="box" type="checkbox" value="C++"/>
    <input type="submit" value="login"/>
  </form>
  </body>
</html>
