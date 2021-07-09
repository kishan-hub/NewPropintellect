<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <body>

	<div id="wrapper">
		<div id="header">
			<h2>Student Message</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			<table>
				<tr>
				    <th>id</th>
					<th>firstName</th>
					<th>lastName</th>
				    <th>email</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempMessages" items="${students}">				
					
					<tr>
					    <td>${tempMessages.id} </td>
						<td> ${tempMessages.firstName} </td>
						<td> ${tempMessages.lastName} </td>
						<td> ${tempMessages.email}</td>
					</tr>
				</c:forEach>
			</table>
				
		</div>
	
	</div>
</body>
</body>
</html>