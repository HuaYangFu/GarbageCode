<%@page import="sun.text.normalizer.UBiDiProps"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="com.model.*"
import="java.util.ArrayList"    
%>
<%
method method = new method();
String id = request.getParameter("id");
ArrayList al = method.idbean(id);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<center>
<table width="60%" height="1097" border="0" >
  <tr>
    <td  colspan="2">
    <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td width="85%" height="823" ><table width="100%" height="819" border="0" >
      <%
	  for(int i =0 ; i<al.size() ;i++){
	    javabean ub = (javabean)al.get(i);
	  %>
      <tr>
        <td height="523" align="center" ><img src="img/<%=ub.getPhto() %>" width="570" height="570" /></td>
      </tr>
      <% } %>
      <tr>
        <td height="17" bgcolor="#E0E0E0" >&nbsp;</td>
      </tr>
      <tr>
        <td height="43" bgcolor="#FFFFFF">關於商品</td>
      </tr>
      <tr>
        <td height="17" bgcolor="#E0E0E0">&nbsp;</td>
      </tr>
      <tr>
    	    <%
			  for(int i =0 ; i<al.size() ;i++){
			    javabean ub = (javabean)al.get(i);
			%>
        <td height="135"><table width="100%" height="73" border="0" >
          <tr>
            <td width="10%" height="20">商品材質</td>
            <td width="93%"><%=ub.getMaterial() %></td>
          </tr>
          <tr>
            <td height="20"><dl>
              <dt>洗滌方式</dt>
            </dl>              </td>
            <td height="20"><%=ub.getLaundryGuide() %></td>
          </tr>
          <tr>
            <td>樣式</td>
            <td><%=ub.getType() %></td>
          </tr>
        </table></td>
        <% } %>
      </tr>
      <tr>
        <td height="17" >&nbsp;</td>
      </tr>
    </table></td>
    <td width="15%"><table width="100%" height="100%" border="0" >
      <tr>
        <td height="150"><table width="100%" border="1">
          <tr>
            <td>選擇顏色</td>
          </tr>
          <tr>
            <td>顏色:</td>
          </tr>
          <tr>
            <td height="35">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="350"><table width="100%" height="155" border="1">
          <tr>
            <td>尺寸</td>
          </tr>
          <tr>
            <td>尺寸</td>
          </tr>
          <tr>
            <td height="36">&nbsp;</td>
          </tr>
          <tr>
            <td height="35">&nbsp;</td>
          </tr>
          <tr>
            <td align="right">尺寸表</td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="202"><table width="100%" border="1">
          <%
		  for(int i =0 ; i<al.size() ;i++){
		    javabean ub = (javabean)al.get(i);
		  %>
          <tr>
            <td>剩餘數量</td>
            <td><%=ub.getNum() %></td>
          </tr>
          <% } %>
        </table></td>
      </tr>
       
      
      <tr>
        <td height="100%"><a href=shoppcar_C?id=<%=id %>&type=add><img src="img/btn_add_cart_disable_TW.gif" width="180" height="100%" /></a></td>
      </tr>
     
    </table></td>
  </tr>
  <tr>
    <td colspan="2">
    <jsp:include flush="true" page="under.jsp"></jsp:include>
    </td>
  </tr>
</table>
</center>
</body>
</html>