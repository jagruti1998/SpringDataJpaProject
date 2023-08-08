<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Debtor Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style type="text/css">
body{
   margin-left: 20px;
}
label{  
    color: #DC143C;font-size: 17px;font-family: Cursive,Lucida Handwriting;  
}
input {
	font-family: Cursive,Lucida Handwriting;  
} 
#i{
     border-color: #DC143C;
}
#rs{
   color: #DC143C;border-color: #DC143C;
}
#bn{
   margin-left: 250px;margin-bottom: 10px;margin-top: 10px;
}
h3{
    color: #DC143C;padding: 20px;margin-right: 33px;font-family: Cursive,Lucida Handwriting;
}
</style>
</head>
<body>

<h3>Enter the Debtor Details</h3>
<form:form  action="addDebtor" modelAttribute="dbt" method="post">

<table>
	 
	<tr class="form-group">
		<td><form:label path="name">Debtor Name:</form:label></td>
		<td><form:input id="i" path="name" class="form-control" required="required"/></td> 
		
	</tr>
	
	<tr class="form-group">
		<td><form:label path="address1">Address Line 1:</form:label></td>
		<td><form:input id="i" path="address1" class="form-control" required="required"/></td> 
	</tr>
	
	<tr class="form-group">
		<td><form:label path="address2">Address Line 2:</form:label></td>
		<td><form:input id="i" path="address2" class="form-control" required="required"/></td> 
	</tr>
	
	<tr class="form-group">
		<td><form:label path="faxno">Fax Number:</form:label></td>
		<td><form:input id="i" path="faxno" class="form-control" minlength="7" maxlength="7" required="required"/></td> 
	</tr>
	
	<tr class="form-group">
		<td><form:label path="phno">Phone Number:</form:label></td>
		<td><form:input id="i" path="phno" class="form-control" minlength="10" maxlength="10" required="required"/></td> 
	</tr>
	
	<tr class="form-group">
		<td><form:label path="email">E-Mail id:</form:label></td>
		<td><form:input id="i" path="email" class="form-control" required="required"/></td> 
	</tr>
</table>
<div id="bn">	
		<input id="rs" class="btn btn-light" type="reset"  value="Clear">
		<input class="btn btn-danger" type="submit" value="Submit"/>
</div>
</form:form><br>
<a href="userpage"><button class="btn btn-danger">Back</button></a>
</body>
</html>