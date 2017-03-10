<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FILE UPLOAD</title>
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
 
<form:form method="POST" commandName="fileUploadForm" enctype="multipart/form-data"> 
	<table border="2" bgcolor="#FFFFFF">
			<thead><b>Add Operation</b></thead>
			<tr>
				<td>Select File</td>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="upload" /></td>
			</tr>
	</table> 
</form:form> 
</body>
</html>