<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="com.model.*"
	import="java.util.ArrayList"
%>
<%
method method = new method();
ArrayList al = method.bean();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<table width="100%" height="100%" border="0" > 
 
  <tr>
    <td><table width="100%" height="10%" border="0" >
      <tr>
        <td bgcolor="#FF0000" height="10"></td><!-- 中間紅隔層-->
      </tr>
      <tr>
        <td height="40" align="left" bgcolor="#FFFFFF">
        <h3 id="anchor1">網眼</h3>
        </td><!-- 衣服分類標簽-->
      </tr>
      <tr>
      
        <td height="10" bgcolor="#E0E0E0"></td><!-- 中間灰隔層-->
      </tr>
    </table></td>
   
  </tr>

  <tr>
    <td><table width="100%" height="50%" border="0" >
      <tr>
        <td align="center">><img src="img/160401-bnr-02.jpg"/></td><!-- 廣告圖-->
      </tr>
      <tr>
        <td height="10" bgcolor="#E0E0E0"></td><!-- 中間灰隔層-->
      </tr>
    </table></td>
  </tr>
  
  <tr>
   <td ><table width="100%" height="35%" border="0" >
      <tr bgcolor="#FFFFFF">
      	<%
      	for(int i =0 ; i<4 ;i++){
      	%>
      		<td width="1%" rowspan="5" bgcolor="#E0E0E0">&nbsp;</td><!-- 中間隔層 -->
	        <td align="right"><img src="img/txt_tag_001.gif"/></td><!-- MAN小圖片 -->
       	<% } %>
       		<td width="1%" rowspan="5" bgcolor="#E0E0E0">&nbsp;</td><!-- 中間隔層 -->
  	  </tr>
     
     <tr bgcolor="#FFFFFF">
     	<%
      	for(int i =0 ; i<al.size() ;i++){
      		javabean ub = (javabean)al.get(i);
      	%>
         <td align="center"><a href=modi.jsp?id=<%=ub.getId()%>><img src="img/<%=ub.getPhto()%>"/></a></td><!-- 衣服圖片-->
        <% } %>
     </tr>
     
      <tr bgcolor="#FFFFFF">
      	<%
      	for(int i =0 ; i<al.size() ;i++){
      		javabean ub = (javabean)al.get(i);
      	%>
        <td height="30" bordercolor="#ECE9D8"><!-- 衣服圖片資訊-->
        <table width="100%" border="0">
          <tr>
            <td width="30%" height="49"><a href=modi.jsp?id=<%=ub.getId()%>><%=ub.getCommodityClass()%></a></td>
            <td width="19%" align="right"><p>&nbsp;</p>
              <p>NT$<%=ub.getPrice() %></p></td>
          </tr>
           <tr height="10">  	
      	   </tr>
        </table>          
        </td>
        <% } %>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>