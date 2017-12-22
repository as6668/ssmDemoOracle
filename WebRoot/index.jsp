<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <h2>根据车名模糊查询店铺信息</h2>
  <form action="<%=basePath%>car/findByCName.do" method="post">
  <input type="text" name="cname" />
 <input type="submit"/> 
  </form>
  <br>
  <h2><a href="<%=basePath%>add.jsp">添加汽车</a></h2>
   <h2> <a href="<%=basePath%>car/findAll.do">查询所有汽车</a></h2>
      <c:if test="${clist!=null}"> 
  <table border="1" width="500px">
   <tr align="center">
   <th>id</th>
   <th>name</th>
   <th>color</th>
   <th>price</th>
   <th>time</th>
   <th>shop</th>
   <th>操作</th>
   </tr>
   <c:forEach var="c" items="${clist}">
   <tr align="center">
   <td>${c.id}</td>
   <td>${c.name}</td>
   <td>${c.color}</td>
   <td>${c.price}</td>
   <td>${c.time}</td>
   <td><a  href="<%=basePath%>car/findShopId.do?shopid=${c.shopid}">查看店铺信息</a></td>
   <td><a  href="<%=basePath%>car/findByCarId.do?id=${c.id}">修改</a>
   		<a  href="<%=basePath%>car/deleteCar.do?id=${c.id}">删除</a></td>
   </tr>
   </c:forEach>
   </table></c:if>
  
  
  
  
  
  
  <c:if test="${list!=null}"> 
  <table border="1" width="500px">
   <tr align="center">
   <th>cname</th>
   <th>sname</th>
   <th>address</th>
   <th>phoneNo</th>
   </tr>
   <c:forEach var="c" items="${list}">
   <tr align="center">
   <td>${c.CNAME}</td>
   <td>${c.SNAME==null?"暂无信息":c.SNAME}</td>
   <td>${c.ADDRESS==null?"暂无信息":c.ADDRESS}</td>
   <td>${c.PHONENO==null?"暂无信息":c.PHONENO}</td>
   
   </tr>
   </c:forEach>
   </table></c:if>
  
  </body>
</html>
