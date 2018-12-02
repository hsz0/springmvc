<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty requestScope.emps}">
    <h3 align="center">NO Employees</h3>
</c:if>
<c:if test="${!empty requestScope.emps}">
    <h3 align="center">Employees LIST</h3>
    <table border="1" width="800px" align="center">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>邮箱</td>
            <td>性别</td>
            <td>部门</td>
            <td>删除</td>
            <td>更新</td>
        </tr>
        <c:forEach items="${requestScope.emps}" var="emp">
            <tr>
                <td>"${emp.id}"</td>
                <td>"${emp.name}"</td>
                <td>"${emp.mail}"</td>
                <td>"${emp.gender==0?'male':'fmale'}"</td>
                <td>"${emp.dep.depName}"</td>
                <td><a href="#">DELETE</a></td>
                <td><a href="#">UPDATE</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
