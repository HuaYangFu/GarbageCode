<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <td height="60" align="center">
    <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td height="70">登入</td>
  </tr>
  <!-- 提交表單 -->
   <form action=registered_C?flag=loging method="post">
	  <tr> 
	    <td height="90" align="center"><table width="42%" height="80" border="0">
	      <tr>
	        <td width="28%">電子郵件地址</td>
	        <td width="72%"><input name=email type="text" size="40" /></td>
	      </tr>
	      <tr>
	        <td>密碼</td>
	        <td><input name=password type="text" size="40" /></td>
	      </tr>
	    </table></td>
	  </tr>
	  <tr></tr>
	  <tr>
	    <td height="70" align="center"><input  type="image"  img src="img/btn-login-01_TW.gif"  onClick="document.form1.submit()" ></td>
	  </tr>
  </form>
  <tr>
    <td height="70">會員註冊</td>
  </tr>
  <tr>
    <td height="84" align="center"><p><a href=registered_V.jsp ><img src="img/btn-new-reg-01_TW.gif" width="101" height="30" /></a></p>
      <ul>
        <li>要訂購商品、或是要使用商品評論時，必須先註冊會員(免費)。 點擊「會員註冊」後開始進行註冊。</li>
    </ul>      </td>
  </tr>
  <tr>
    <td height="60" align="center">
    <jsp:include flush="true" page="under.jsp"></jsp:include>
    </td>
  </tr>
</center>
</table>
</body>
</html>