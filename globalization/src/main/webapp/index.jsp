<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 傅華暘
  Date: 2016/12/3
  Time: 下午 05:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <script src="lib/jquery.js"></script>
  <script type="text/javascript">
    function doAjaxPost() {
      // get the form values
      var name = $('#name').val();

      $.ajax({
        type: "POST",
        url: "ajaxSubmit.action",
        data: "name=" + name,
        success: function(response){
          // we have the response
          $('#info').html(response);
        },
        error: function(e){
          alert('Error: ' + e);
        }
      });
    }
  </script>
</head>
<body>
<body>
Enter your name please : <input type="text" id="name"><br/>
<input type="button" value="Say Hello" onclick="doAjaxPost()"><br/>
<div id="info" style="color: green;"></div>
</body>
</body>
</html>
