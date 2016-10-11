<%--
  Created by IntelliJ IDEA.
  User: 傅華暘
  Date: 2016/10/6
  Time: 上午 02:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <style type="text/css">
        #box{font-family:Microsoft JhengHei;}

        #body a{text-decoration: none;}
        #body a:hover{color: white;}
        #body{margin-top: 1%;}
        #body_number,#body_title,#body_edit,#body_delete,#body_dateStart,#body_dateEnd
        {padding-top: 0.5%;padding-bottom: 0.5%;text-align: center;background: #CCEEFF	;}
        #body_number{float: left; width: 3%;}
        #body_title{float: left; width: 32%;}
        #body_dateStart{float: left;width: 20%;}
        #body_dateEnd{}
        #body_edit{float: right;width: 10%;}
        #body_delete{float: right; width: 10%;}

        #body_number_1,#body_title_1,#body_edit_1,#body_delete_1,#body_dateStart_1,#body_dateEnd_1
        {padding-top: 0.5%;padding-bottom: 0.5%;text-align: center;background: #CCEEFF	;}
        #body_number_1{float: left; width: 3%;}
        #body_title_1{float: left; width: 32%;}
        #body_dateStart_1{float: left;width: 20%;}
        #body_dateEnd_1{}
        #body_edit_1{float: right;width: 10%;}
        #body_delete_1{float: right; width: 10%;}

        #foot{padding-left: 45%;padding-top: 1%}
        #foot a{
            background: black;border-radius: 10px;width: 20px;height: 20px;
            display: block;float: left;text-align: center;text-decoration: none;
        }
    </style>
</head>
<body>
<div id="box">
    <jsp:include page="top.jsp"/>
    <div id="body">
        <div id="body_number_1">編號</div>
        <div id="body_title_1">標題</div>
        <div id="body_dateStart_1">發布日期</div>
        <div id="body_edit_1">修改</div>
        <div id="body_delete_1">刪除</div>
        <div id="body_dateEnd_1">結束日期</div>

        <s:iterator value='messageList'>
        <div id="body_number"><s:property value="num"/></div>
        <a href="showMessage?message.num=<s:property value="num"/>"><div id="body_title"><s:property value="title"/></div></a>
        <div id="body_dateStart"><s:property value="Start_date"/></div>
        <a href="updata_show?message.num=<s:property value='num'/>"><div id="body_edit">修改</div></a>
        <a href="delete?message.num=<s:property value='num'/>"><div id="body_delete">刪除</div></a>
        <div id="body_dateEnd"><s:property value="End_date"/></div>
        <hr>
        </s:iterator>

    </div>
    <div id="foot">
        <a href="Welcome?now=${now-1}"><</a>
           <c:forEach var="i" begin="1" end="${pagecount}" step="1">
               <a href="Welcome?now=${i}">${i}</a>
           </c:forEach>
        <a href="Welcome?now=${now+1}">></a>
    </div>
</div>
</body>
</html>
