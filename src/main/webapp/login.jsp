<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
	.errorMessage {
		color: red;
	}
</style>

</head>

<body>
	Identifiez-vous: 
	<s:actionerror />
	<s:form action="login" method="post">
		<s:textfield name="login" label="Identifiant"/>
		<s:password name="password" label="Mot de passe"/>
		<s:submit/>
	</s:form>

</body>
</html>