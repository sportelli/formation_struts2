<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
  </head>
  <body>
    Bienvenu dans TestVar.jsp
    <s:property value="maVariable"/> <br/>
    maVariable fait <s:property value="taille"/> caractère(s). <br/>
    
    <!-- Si user existe => afficher les informations -->
    <!-- Sinon, afficher : utilisateur n'existe pas -->
    
    <s:if test="%{isExist}">
	    Bienvenu à toi cher <s:property value="user.prenom"/> <s:property value="user.nom"/>.
    </s:if>
    <s:else>
    	Utilisateur n'existe pas
    </s:else>
    
  </body>
</html>