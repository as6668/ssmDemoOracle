<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script language="javascript" type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js">
  </script>
  <script language="javascript" type="text/javascript" src="<%=basePath%>jQuery/jquery-3.2.1.min.js">
  </script>
  <script type="text/javascript">
  $(function(){
  		$("#name").blur(function(){
  		var a = $("#name").val();
  		$.post("/ssmDemo/car/findByName.do",
  		{"name" : a}, function(data) {
					if (data == 1) {
						$("#name").attr("style", "border-color:green;");
						$("#sp").html("可以添加");
						$("#sp").attr("style", "color:green;");
					} else {

						$("#name").attr("style", "border-color:red;");
						$("#sp").html("不可以添加");
						$("#sp").attr("style", "color:red;");

					}
				}, "json");
  		
  		})
  
  })
  
  
  </script>
  </head>
  
  <body>
 <form action="<%=basePath%>car/addCar.do" method="post">
 	
 	name:<input id="name" type="text"  name="name"><span id="sp"></span><br>
 	color:<input type="text"  name="color"><br>
 	price:<input type="text"  name="price"><br>
 	time:<input type="text"  name="time" class="Wdate" onClick="WdatePicker()"><br>
	<input type="submit"/>
 
 </form>
  </body>
</html>
