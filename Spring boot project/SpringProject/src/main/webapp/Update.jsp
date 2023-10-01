<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updating the existed record</title>
<link rel="stylesheet" href="update.css">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/update.css">
</head>
<body>
<form action="update">
<h2>Updating the Record</h2>
<div class="mains">
<div class="box">
Id:<input type="number" name="id"/><br>
Name:<input type="text" name="Name"/><br>
City:<input type="text" name="City"/><br>
Age:<input type="number" name="age"/><br>
<button type="submit">update record</button><br>
</div>
<a href="home.html"> BACK TO HOME</a>
</div>

</form>

</body>
</html>