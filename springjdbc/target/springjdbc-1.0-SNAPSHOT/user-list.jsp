<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>用户添加页面</h1>
    <table align="center" border="1" cellpadding="5" cellspacing="0" >
        <tr>
            <td>序 号</td>
            <td>用户名</td>
            <td>密 码</td>
        </tr>

        <c:forEach items="${userList}" var="user" >
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>

    </table>

</form>
</body>
</html>
