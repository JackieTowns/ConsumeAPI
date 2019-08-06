<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="famousStyle.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Tiny Inventors</title>
</head>
<body class="body">

<header> 
		<p><a href="/complete">Complete List</a></p>
</header>

	<h1> Tiny Inventors</h1>
	<hr/>
	<table class="table-hover" id="theTinyTable" >
		<tr><th>Name</th><th>Invention</th><th>Year</th></tr>
		
		<c:forEach items="${list}" var="theList">
		
			<tr>
				<td>${theList.name}</td>
				<td>${theList.invention}</td>
				<td>${theList.year}</td>
			</tr>
		
		</c:forEach>
	
	</table>	

</body>
</html>