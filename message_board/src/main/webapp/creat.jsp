<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  user: 傅華暘
  Date: 2016/10/9
  Time: 下午 03:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery.min.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/jquery-te-1.4.0.js" charset="utf-8"></script>
    <style>
        #box{font-family:Microsoft JhengHei;}
        #show{margin-top: 1%}
        #show_1{text-align: center;}
        #show_2{}
        #show_push{background:#000088;color: white;border: none;font-size: medium;font-family:Microsoft JhengHei;}
        #show_push:hover{background: black}
        #show_tile,#show_startDate{background: #B94FFF;}
        #show_autor,#show_EndDate{background: #D28EFF;}
        #show_tile,#show_autor,#show_startDate,#show_EndDate,#show_push{padding-top: 1%;padding-bottom: 1%;}
        #show_tile,#show_autor,#show_startDate,#show_push{float: left;width: 20%;}
        #show_2_write{height: 500px;width: 100%;background: black;color: white}
    </style>
</head>
<body>
<div id="box">
    <jsp:include page="top.jsp"/>
    <div id="show">
        <form action="add.action" method="post">
        <div id="show_1">
                <div><input type="submit" id="show_push" value="發佈"/></div>
                <div id="show_tile">標題<input type="text" name="message.title"  value="" /></div>
                <div id="show_autor">作者<input type="text" name="message.author"  value="" /></div>
                <div id="show_startDate">發佈日期<input type="text" name="message.Start_date"  value="2016/01/01"  /></div>
                <div id="show_EndDate">截止日期<input type="text" name="message.End_date"  value="2016/01/01"  /></div>

        </div>
        <div id="show_2">
            <div id="test" name="message.message" contenteditable="true"></div>
        </div>
        </form>
        <script>
            $('#test').jqte();
        </script>
    </div>
</div>
</body>
</html>
