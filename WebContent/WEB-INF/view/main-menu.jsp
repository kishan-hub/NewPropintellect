<!DOCTYPE>
<html>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Message</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			<table>
				<tr>
				    <th>No</th>
					<th>Text</th>
					<th>Messages</th>
				
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempMessages" items="${messages}">				
					
					<tr>
					    <td>${tempMessages.id} </td>
						<td> ${tempMessages.text} </td>
						<td> ${tempMessages.textmessage} </td>
					</tr>
				</c:forEach>
			</table>
				
		</div>
	
	</div>
</body>

</html>