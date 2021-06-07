<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>用户添加页面</h1>
<form action="/user/add.do" >
    <table align="center" border="1" cellpadding="5" cellspacing="0" >
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr align="right">
            <td colspan="2">
                <input type="submit" value="添加">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
