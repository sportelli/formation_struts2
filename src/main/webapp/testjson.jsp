<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<button id="bouton">Clique ici</button>
<div id="result"></div>

<script>
	$("#bouton").click(function(){
		var input = {"user": {"nom": "sportelli","prenom": "felix" }};
		console.log(input);
		var settings = {
				  "async": true,
				  "crossDomain": true,
				  "url": "jsonuser.html",
				  "method": "POST",
				  "headers": {
				    "Content-Type": "application/json",
				    "Cache-Control": "no-cache"
				  },
				  "processData": false,
				  "data": JSON.stringify(input)
				};
	
		$.ajax(settings).done(function (response) {
		  console.log(response);
		  $("#result").html(response.login)
		});
	});			
</script>

</body>
</html>