<html>
<head>
    <title>Yahoo!!</title>
</head>
<%
System.out.println(request.getParameter("name"));
%>
<body>

<form action = "/login" method = "post">
<p><font color = "red">${errorMessage}</font></p>
Enter your name <input type = "text" name = "name"/>
Password: <input type = "password" name = "password"/><input type = "submit" value = "login"/>
</form>
</body>
</html>
