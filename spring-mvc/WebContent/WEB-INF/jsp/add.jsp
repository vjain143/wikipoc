<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Account</title>
</head>
<body>
<div>
	<div>
		<h3>Spring MVC Sample Application for CURD Operations along with Upload File Operation.</h3>		
	</div>
	<div>
		<table border="2" width="100%" bgcolor="#FFFFFF">
			<tr>
				<td width="25%" bgcolor="#FFFFFF" align="center"><b><a href="show.do?number=2">View</a></b></td>
				<td width="25%" bgcolor="#FFFFFF" align="center"><b><a href="add.do">Add</a></b></td>
				<td width="25%" bgcolor="#FFFFFF" align="center"><b><a href="updateInput.do">Update</a></b></td>
				<td width="25%" bgcolor="#FFFFFF" align="center"><b><a href="delete.do?number=2">Remove</a></b></td>										
			</tr>			
		</table>		
	</div>
	<br>
	<div>
		<table border="2" width="100%">
			<tr>
				<td width="100%" bgcolor="#FFFFFF"><b><a href="upload.do">Upload File</a></b></td>
			</tr>				
		</table>		
	</div>
</div>

<br>
<form:form>
	<table border="2" bgcolor="#FFFFFF">
		<thead><b>Add Operation</b></thead>
		<tr>
			<td>Number</td>
			<td><form:input path="number" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Organization</td>
			<td><form:input path="organization" /></td>
		</tr>
		<tr>
			<td><input type="reset" value="Reset" /></td>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>	
</form:form>

</body>
</html>