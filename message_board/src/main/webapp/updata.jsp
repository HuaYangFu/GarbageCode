<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  user: 傅華暘
  Date: 2016/10/10
  Time: 上午 02:45
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
    <s:iterator value='message'>
        <form action="updata" method="post">
        <div id="show_1">
            <div><input type="submit" id="show_push" value="修改"/></div>
            <input type="hidden" name="message.num" value="<s:property value="num"/>">
            <div id="show_tile">標題<input type="text" name="message.title"  value="<s:property value="title"/> " /></div>
            <div id="show_autor">作者<input type="text" name="message.author"  value="<s:property value="author"/>" /></div>
            <div id="show_startDate">發佈日期<input type="text" name="message.Start_date"  value=<s:property value="Start_date"/>/></div>
            <div id="show_EndDate">截止日期<input type="text" name="message.End_date"  value=<s:property value="End_date"/>/></div>
        </div>
        <div id="show_2">
            <textarea name="message.message" id="show_2_write"><s:property value="message"/></textarea>
        </div>
        </form>
    </s:iterator>
    </div>
</div>
<script>
    $('textarea').jqte();
</script>
</body>
</html>
