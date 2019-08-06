<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="famousStyle.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Complete Inventors</title>
</head>
<body class="body">

<header>
	<p><a href="/">Tiny List</a></p>
</header>

	<h1> Complete Inventors</h1>
	<hr/>
	<table class="table-hover" id="theCompTable">
		<tr><th>First Name</th><th>Last Name</th><th id="invent">Invention</th><th>Year</th></tr>
		
		<c:forEach items="${listComp}" var="theListComp">
		
			<tr>
				<td>${theListComp.firstName}</td>
				<td>${theListComp.lastName}</td>
				<td>${theListComp.innovation}</td>
				<td>${theListComp.year}</td>
			</tr>
	</c:forEach>
	</table>	


</body>
</html>