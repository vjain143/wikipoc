<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Show Account</title>
</head>
<body>	
<br>
 
	<form:form>
	<br>
		Name: <form:input  path="name" /><br>
		Organization: <form:input path="organization" /><br>
	<input type="submit" value="Save Changes" />
	</form:form>
		
</body>
</html>