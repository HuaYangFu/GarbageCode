<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList"
    import="com.model.*"
    %>
<%
ArrayList al1 = (ArrayList)request.getAttribute("al1");   
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
    <td colspan="6" align="center">
     <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td colspan="6" align="center">訂單</td>
  </tr>
  <tr>
    <td width="12%" height="26" align="center">訂單編號</td>
    <td width="12%" align="center">收件人</td>
    <td width="23%" align="center">電子郵件</td>
    <td width="28%" align="center">收件地址</td>
    <td width="12%" align="center">商品總價</td>
    <td width="13%" align="center">商品詳情</td>
  </tr>
  <% for(int i = 0 ; i<al1.size() ; i++){
	   ub = (order_B)al1.get(i);
  %>
  <tr>
    <td height="56" align="center"><%=ub.getId() %></td>
    <td height="56" align="center"><%=ub.getName() %></td>
    <td height="56" align="center"><%=ub.getEmail() %></td>
    <td height="56" align="center"><%=ub.getAddress() %>;</td>
    <td height="56" align="center"><%=ub.getTotal() %></td>
    <td height="56" align="center"><a href=order_C?flag=showmodi&id=<%=ub.getId()%>>商品詳情</a></td>
  </tr>
  <% } %>
  <tr>
    <td colspan="6" align="center">
     <jsp:include flush="true" page="under.jsp"></jsp:include>
    </td>
  </tr>
</table>
</center>
</body>
</html>