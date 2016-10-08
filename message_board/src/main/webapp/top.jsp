<%--
  Created by IntelliJ IDEA.
  User: 傅華暘
  Date: 2016/10/8
  Time: 下午 06:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

        #link a{text-decoration: none;}
        #link a:hover{color: white;}

        #top{}
        #top_1{background:#000088;text-align: center;padding-top: 1%;padding-bottom: 1%;color: white;}

        #link{height: 20%;}
        #link_1,#link_2,#link_3,#link_4,#link_5
        {padding-top: 1%;padding-bottom: 1%;text-align: center;font-size: 20px;}
        #link_1{width: 20%;float: left;background: #D28EFF;}
        #link_2{width: 20%;float: left;background: #B94FFF;}
        #link_3{width: 20%;float: right;background: #D28EFF;}
        #link_4{width: 20%;float: right;background: #B94FFF;}
        #link_5{background: #D28EFF;}
    </style>
</head>
<body>
    <div id="top">
        <div id="top_1"><h1>公佈欄</h1></div>
    </div>
    <div id="link">
        <a href="#"><div id="link_1">回首頁</div></a>
        <a href="#"><div id="link_2">發佈公告</div></a>
        <a href="#"><div id="link_3">搜尋</div></a>
        <a href="#"><div id="link_4">登入</div></a>
        <a href="#"><div id="link_5">註冊</div></a>
    </div>
</body>
</html>
