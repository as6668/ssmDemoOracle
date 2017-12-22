<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
  </head>
  
  <body>
 <form action="<%=basePath%>car/updateCar.do" method="post">
 	<input type="hidden" value="${car.id}" name="id"><br>
 	<input type="hidden" value="${car.shopid}" name="shopid"><br>
 	name:<input type="text" value="${car.name}" name="name"><br>
 color:<input type="text" value="${car.color}" name="color"><br>
 price:<input type="text" value="${car.price}" name="price"><br>
 time:<input type="text" value="${car.time}" name="time" class="Wdate" onClick="WdatePicker()"><br>
	<input type="submit"/>

 
 
 </form>
  </body>
</html>
