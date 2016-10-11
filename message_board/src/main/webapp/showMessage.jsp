<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  user: 傅華暘
  Date: 2016/10/9
  Time: 下午 06:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="css/jquery-te-1.4.0.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery.min.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/jquery-te-1.4.0.js" charset="utf-8"></script>
    <style>
        #box{font-family:Microsoft JhengHei;}
        #show{margin-top: 1%}
        #show_1{text-align: center;}
        #show_2{background: black;color: white}
        #show_push{background:#000088;color: white}
        #show_tile,#show_startDate{background: #B94FFF;}
        #show_autor,#show_EndDate{background: #D28EFF;}
        #show_tile,#show_autor,#show_startDate,#show_EndDate,#show_push{padding-top: 1%;padding-bottom: 1%;}
        #show_tile,#show_autor,#show_startDate,#show_push{float: left;width: 20%;}
    </style>
</head>
<body>
<div id="box">
    <jsp:include page="top.jsp"/>
    <div id="show">
    <s:iterator value='message'>
        <div id="show_1">
            <div id="show_push">編號<s:property value="num" /></div>
            <div id="show_tile">標題<s:property value="title" /></div>
            <div id="show_autor">作者<s:property value="author" /></div>
            <div id="show_startDate">發佈日期<s:date name="Start_date" format="yyyy/yy/yy" /></div>
            <div id="show_EndDate">截止日期<s:date name="End_date" format="yyyy/yy/yy" /></div>
        </div>
        <div id="show_2"></div>
        <textarea><s:property value="message" /></textarea>
    </s:iterator>
    </div>
</div>
<script>
    $('textarea').jqte();
</script>
</body>
</html>
