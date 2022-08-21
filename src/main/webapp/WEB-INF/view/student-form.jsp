<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<title>Student registration form</title>
</head>
<body>

	<!-- when loading this form, spring calls getFirstName() and on submit setFirstName(...) -->
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />

		<br>
		<br>
		
		Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Country:
		<form:select path="country">
			<form:option value="Brazil" label="bRaZiL"></form:option>
			<form:option value="Germany" label="gErmany"></form:option>
			<form:option value="Bosnia" label="boZZZnia"></form:option>
		</form:select>

		<br>
		<br>
		
		Color:
		<form:select path="color">
			<form:options items="${student.colorOptions}"></form:options>
		</form:select>
		<input type="submit" value="Submit" />
	</form:form>




</body>
</html>