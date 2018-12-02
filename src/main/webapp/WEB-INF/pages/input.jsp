<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${abc.id!=null?'UPDATE EMP':'ADD EMP'}</h3>
<form:form action="emp" method="post" modelAttribute="abc">
    <table>
        <tr>
            <td>姓名</td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><form:input path="mail"></form:input></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><form:radiobuttons path="gender" items="${requestScope.genders}"></form:radiobuttons></td>
        </tr>
            <%--class必须包含空构造器,否则识别不了dept--%>
        <tr>
            <td>部门</td>
            <td><form:select path="dep.depId" items="${requestScope.deps}" itemLabel="depName"
                             itemValue="depId"></form:select></td>
        </tr>
        <tr>
            <td><input type="submit" value="${abc.id!=null?'UPDATE':'ADD'}"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
