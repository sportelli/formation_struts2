<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
  </head>
  <body>
    List_users.jsp

	<table>
		<thead><tr><th>ID</th><th>Nom</th><th>Prenom</th></tr></thead>
		<tbody>
		    <s:iterator value="utilisateurs">
		    	<tr>
			    	<td>
		    			<s:property value="id"/>
		    		</td>
		    		<td>
		    			<s:property value="nom"/>
		   			</td>
		   			<td>
		    			<s:property value="prenom"/>
		    		</td>
		   		</tr>
		    </s:iterator>
    	</tbody>
	</table>    
    
  </body>
</html>