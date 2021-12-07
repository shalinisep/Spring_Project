<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<style type="text/css">
body {
	background-image: url("img/hp2.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	min-height: 100%;
	background-color: #FFFFE0;
}
.styled-table {
	align-content: center; border-collapse : collapse;
	margin: 10px 0;
	font-size: 0.9em;
	font-family: sans-serif;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
	background-color: #DDA0DD ;
	border-collapse: collapse;
	
}

.styled-table th, .styled-table td {
font-family:inherit;
	padding: 8px 8px;
	align-content: center;
}
.button {
    display: block;
   width:200px;
    height: 30px;
    background:#C71585;
    padding: 0px;
    text-align: center;
    border-radius: 10px;
    color:white;
    font-weight: bold;
    line-height: 25px;
}

</style>

<body>
	<div align="center">
<div><h3 style="color: #800080; padding: 20px" align="center">Edit Book</h3></div>
		<h1 style="color: #2874A6">${msg}</h1>
		<form:form action="/saveupdate" modelAttribute="books"
			enctype="multipart/form-data">
			<table class="styled-table">
				<tr>
					<td>Book Id :</td>
					<td><form:input path="bookId" /></td>
				</tr>
				<tr>
					<td>Book Title :</td>
					<td><form:input path="bookTitle" /></td>
				</tr>
				<tr>
					<td>Author Name :</td>
					<td><form:input path="bookAuthor" /></td>
				</tr>
				<tr>
					<td>Publication :</td>
					<td><form:input path="bookPublication" /></td>
				</tr>
				<tr>
					<td>Genre :</td>
					<td><form:select path="bookGenre">
							<form:option value="History">History</form:option>

							<form:option value="Fantasy">Fantasy</form:option>

							<form:option value="Biographies">Biographies</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>Available mode :</td>
					<td>E-Copy<form:checkbox path="bookType" value=" e-copy" /> <br />
						Paper Back<form:checkbox path="bookType" value=" paper back" />
					</td>
				</tr>
				 <tr>
					<td>Book Cover :</td>
					<td><input type="file" name="pic"></td>
			
				</tr>
				<tr>
					<td>Book Quantity :</td>
					<td><form:input path="bookQuantity" type="int"/></td>
				</tr>

				<tr>
				<tr>
					<td>Can Borrow?</td>
					<td><form:radiobutton path="bookBorrow" value="yes" />yes <br />
						<form:radiobutton path="bookBorrow" value="no" />no</td>

				</tr>
				<tr>
					<td>Date of Entry</td>
					<td><form:input path="dateOfentry" type="Date"/></td>
				</tr>

				<tr>
					<td><input type="submit" value="Update"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>

			</table>
		</form:form>
<br/>

		<div align="center">
			<a href="/SecPage" class=button>Home Page</a>
		</div>

	</div>
</body>
</html>