<%--
  Created by IntelliJ IDEA.
  User: my
  Date: 2018/11/15
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="hello?name=tome">Hello</a>
<br/>
<a href="antstyle">AntStyle</a>
<br/>
<a href="testPathVar/76">PathVar</a>
<br/>
获取用户信息
<a href="testGet">testGet</a>
<br/>
新建用户信息
<form action="testPost" method="post">
    <input type="submit" value="POST">
</form>
<br/>
删除用户信息
<form action="testDelete/12" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE">
</form>
<br/>
更新用户信息
<form action="testPut/12" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT">
</form>
<br/>
测试获取请求参数值
<form action="testRequestParam" method="post">
    id:<input type="text" name="id" value="输入id">
    name:<input type="text" name="name" value="输入name">

    <input type="submit" value="Submit">
</form>
<br/>
Pojo绑定请求参数
<form action="testPojoParam" method="post">
    id:<input type="text" name="id"><br/>
    name:<input type="text" name="name"><br/>
    city:<input type="text" name="address.city"><br/>
    street:<input type="text" name="address.street"><br/>
    <input type="submit" value="Submit">
</form>
<br/>
获取请求报头信息
<a href="testRequestHeader">testRequestHeader</a>
<br/>
获取Cookie中信息
<a href="testCookieValue">testCookieValue</a>
<br/>
ModelAndView
<a href="testModelAndView">testModelAndView</a><br/>
Map
<a href="testMap">testMap</a><br/>
Model
<a href="testModel">testModel</a><br/>
ModelMap
<a href="testModelMap">testModelMap</a>

<form action="testModelAttribute">
    id:<input type="text" name="id">
    name:<input type="text" name="name">
    <input type="submit" value="Update">
</form>

<a href="emplist">Employee List</a>
<br/>
<a href="input/0">Add Employee</a>
</body>
</html>
