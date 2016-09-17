<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="com.model.*"
%>
 <%
 shoppcar_BO sh = (shoppcar_BO)session.getAttribute("mycar");
 ArrayList al = (ArrayList)request.getAttribute("al");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body topmargin="4%">
<center>
<table width="60%" border="1">
  <tr align="center">
    <td colspan="7">
     <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr >
    <td height="50" colspan="7">購物車</td>
  </tr>
  <tr>
    <td width="14%" align="center">商品照片</td>
    <td width="14%" align="center">商品名稱</td>
    <td width="14%" align="center">商品單價</td>
    <td width="11%" align="center">數量</td>
    <td width="11%" align="center">小記</td>
    <td width="11%" align="center">刪除商品</td>
    <td width="25%" align="center">備註</td>
  </tr>
  <!-- 循環添加商品 --> 
  <%
  	for(int i =0 ; i<al.size() ;i++){
		javabean ub = (javabean)al.get(i);
  %>
  <tr>
    <td height="129" align="center"><img src="img/<%=ub.getPhto() %>" width="90" height="90" /></td>
    <td align="center"><%=ub.getCommodityClass() %></td>
    <td align="center">NT$<%=ub.getPrice() %></td>
    <td align="center">
        <!-- 提交修改表單 -->
        <form action=shoppcar_C?type=edit&id=<%=ub.getId() %> method=post>
	        <p><input type="text" name="textfield" value="<%=sh.getnum(ub.getId()+"") %>" size="2" /></p>
	        <p><input  type="image"  img src="img/btn-change-02_TW.gif"  onClick="document.form1.submit()" ></p>
	    </form>
	
	</td>        
    <td align="center">NT$<%=ub.getPrice() %></td>
    <!-- 刪除鈕-->
    <td align="center"><a href=shoppcar_C?type=delete&id=<%=ub.getId() %>><img src="img/btn-cancel-01_TW.gif" width="36" height="21" /></a></td>
    <td align="center">&nbsp;</td>
  </tr>
   <% } %>
  
  <tr align="center">
    <td height="37" colspan="5">&nbsp;</td>
    <td>總計</td>
    <td>NT$<%=sh.total() %></td>
  </tr>
  <tr align="center">
    <td height="90" colspan="7"><a href="loging_V.jsp"><img src="img/btn-go-checkout-01_TW.gif" width="381" height="61" /></a></td>
  </tr>
  <tr align="center">
    <td colspan="7">
     <jsp:include flush="true" page="under.jsp"></jsp:include>
    </td>
  </tr>
</table>
</center>
</body>
</html>