<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Account</title>
</head>
<body>
	<div>
		<div>
			<h3>Spring MVC Sample Application for CURD Operations along with Upload File Operation.</h3>		
		</div>		
	</div>	
	<div>
		<form:form action="view.do" method="POST">
			<table border="2" bgcolor="#FFFFFF">
				<thead>
					<b>Update Operation</b>
				</thead>	
				<tr>
					<td>Number</td>
					<td><input type="text" id="number"/></td>
				</tr>	
				<tr>
					<td><input type="reset" value="Reset" /></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>	
			</table>			
		</form:form>
	</div>	
</body>
</html>