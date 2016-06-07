<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spitter</title>
</head>
<body>
<h1>Register</h1>
<sf:form method="POST" commandName="spitter">
<sf:errors path="*" element="div"></sf:errors>
First Name:<sf:input path="firstName"/><sf:errors path="firstName"></sf:errors>
Last Name:<sf:input path="lastName"/>
UserName:<sf:input path="userName"/>
Password:<sf:password path="password"/>
<input type="submit" value="register">
</sf:form>

</body>
</html>