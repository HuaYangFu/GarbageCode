<%--
  Created by IntelliJ IDEA.
  User: 傅華暘
  Date: 2016/10/11
  Time: 下午 02:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #ris_2{padding-left: 42%;margin-top: 1%}
    </style>
</head>
<body>
<div id="box">
    <jsp:include page="top.jsp"/>
    <div>
        <div id="ris_2">
            <form action="user_creat" method="post">
                <div><label>姓名 </label><input type="text" name="user.name" value="text"></div>
                <div><label>帳號 </label><input type="text" name="user.account" value="text"></div>
                <div><label>密碼 </label><input type="text" name="user.password" value="text"></div>
                <input type="submit">
            </form>
        </div>
        <hr>
    </div>
</div>
</body>
</html>
