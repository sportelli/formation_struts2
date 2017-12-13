<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Nb visites: <s:property value="session.nbVisites"/>
	<br />
	Envoi de variable "maVariable" vers testvar.action
	<form method="post" action="form_register.action">
		Mavariable: <input type="text" name="maVariable" /> <br /> User.id:
		<input type="text" name="user.id" /> <br /> User.prenom: <input
			type="text" name="user.prenom" /> <br /> User.nom: <input
			type="text" name="user.nom" /> <br /> <input type="submit" />
	</form>
	<s:form method="post" action="form_register">
		<s:textfield name="maVariable" label="Ma variable" />
		<s:textfield name="user.id" label="User.id" />
		<s:textfield name="user.prenom" label="User.prenom" />
		<s:textfield name="user.nom" label="User.nom" />
		<s:select name="sexe" list="sexes" label="Sexe" style="width: 100%;"
			headerKey="Inconnu" headerValue="-- SEXE --" />
		<s:select name="sexe2" list="sexesList" label="Sexe L" style="width: 100%;"
			listKey="id" listValue="name"
			headerKey="Inconnu" headerValue="-- SEXE --" />
		<s:radio name="sexeRadio" list="sexes" label="Sexe Radio" />
		<s:submit />
	</s:form>
</body>
</html>