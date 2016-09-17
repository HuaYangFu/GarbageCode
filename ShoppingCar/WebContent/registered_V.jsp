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
    <td colspan="3" align="center">
    <jsp:include flush="true" page="top.jsp"></jsp:include>
    </td>
  </tr>
  <tr>
    <td height="60" colspan="3" align="left">註冊</td>
  </tr>
  <!-- 提交表單 -->
  <form action=registered_C?flag=registered method="post">
  <tr>
    <td width="15%" height="22" align="center">姓名</td>
    <td width="42%" height="60" align="center"><input name=name type="text" size="30"/></td>
    <td width="43%" align="center">(例) 王小明</td>
  </tr>
  <tr>
    <td align="center">性別</td>
    <td height="60" align="center">
	   
			<select name="gender" >
			　<option value="man">男</option>
			　<option value="woman">女</option>
			</select>
		
    </td>
    <td height="50" align="center">(例)男</td>
  </tr>
  <tr>
    <td align="center">電子郵件</td>
    <td height="60" align="center"><input name=email type="text" size="30"/></td>
    <td height="50" align="center"><p>(例) xxxxx@uniqlo.com.tw <br />
      </p>
    </td>
  </tr>
  <tr>
    <td align="center">密碼</td>
    <td height="60" align="center"><input name=password  type="text" size="30"/></td>
    <td height="50" align="center">請輸入X位數，需同時包含英文和數字。<br />
    (例)u1n2i3q4l5o</td>
  </tr>
  <tr>
    <td align="center">地址</td>
    <td height="60" align="center"><input name=address type="text" size="30"/></td>
    <td height="50" align="center">(例) 台北市信義區 </td>
  </tr>
  <tr>
   <td height="60" colspan="3" align="center"><input type="submit" value="註冊"/></td>
  </tr>
  </form>
  <tr>
    <td colspan="3" align="center">
    <jsp:include flush="true" page="under.jsp"></jsp:include>
    </td>
  </tr>
</table>
</center>
</body>
</html>