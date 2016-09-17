<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList"
    import="com.model.*"
    %>
<%
ArrayList al = (ArrayList)request.getAttribute("al");   
order_B ub = new order_B();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<table width="60%" border="1">
  <tr>
    <td colspan="4" align="center">
     <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td height="35" align="center">商品照片</td>
    <td align="center">商品名稱</td>
    <td align="center">商品單價</td>
    <td align="center">數量</td>
  </tr>
  <% for(int i = 0 ; i<al.size() ; i++){
	   ub = (order_B)al.get(i);
  %>
  <tr>
    <td height="85" align="center"><img src="img/<%=ub.getPhoto() %>" width="90" height="90" /></td>
    <td align="center"><%=ub.getModiname() %></td>
    <td align="center"><%=ub.getPrice() %></td>
    <td align="center"><%=ub.getNum() %></td>
  </tr>
  <% } %>
  <tr>
    <td colspan="4" align="center">
     <jsp:include flush="true" page="under.jsp"></jsp:include>
    </td>
  </tr>
</table>
</center>
</body>
</html>