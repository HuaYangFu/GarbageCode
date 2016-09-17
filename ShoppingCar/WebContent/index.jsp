<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#E0E0E0" >
<center>
<table width="60%" border="1" bordercolor="#E0E0E0">
  <tr>
    <td  colspan="2" align="center">
     <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td height="450" align="center">
     <jsp:include flush="true" page="center.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td height="100" colspan="2" >
 		<jsp:include flush="true" page="under.jsp"></jsp:include>
	</td>
  </tr>
</table>
</center>
</body>
</html>