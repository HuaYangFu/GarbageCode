<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 傅華暘
  Date: 2016/12/3
  Time: 下午 05:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <style type="text/css">
    a{
      font-size: 36px;
    }
    .test{
      text-align: center;
      margin-top: 20%;
    }
  </style>
</head>
<body>
<div class="test">
  <a href="welcome.action?request_locale=en_US">English</a>
  &nbsp;
  <a href="welcome.action?request_locale=zh_CN">中文</a>
  <p><s:text name="welcome"/></p>
</div>
</body>
</html>
