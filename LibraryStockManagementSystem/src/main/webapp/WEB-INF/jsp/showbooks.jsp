<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>

<style type="text/css">
h3 {
color: #8B0000;
font-family: arial, sans-serif;
font-size: 25px;


margin-top: 20px;
margin-bottom: 20px;
text-align: center;

display: block;
    background: #DDA0DD ;
    padding: 15px;
    border-radius: 2px;
    color:white;
    font-weight: bold;
    line-height: 30px;

}
body{
background-color:#E6E6FA;
color:  #8B0000;
background-image: url("img/home.jpg");
background-size: cover;
	background-repeat: no-repeat;
	min-height: 100%;
}
.button {
    display: block;
    width: 115px;
    height: 30px;
    background: #DDA0DD;
    padding: 0px;
    text-align: center;
    border-radius: 2px;
    color:white;
    font-weight: bold;
    line-height: 25px;
}

table{
background-color: #FFB6C1;
}

</style>
</head>

<body>
	<div align="center" class="container">
		<h3>Search</h3>
	 <h2>${msg}</h2>
		<table class="table table-hover">
		
			<thead class="thead-dark">
			<tr>
					<th>Book ID</th>
					<th>Book Title</th>
					<th>Author Name</th>
					<th>Publication</th>
					<th>Genre</th>
					<th>Type</th>
					<th>Book Cover</th>
					<th>Book Quantity</th>
					<th>Book Borrow</th>
					<th>Date Of Entry</th>
				</tr>
				</thead>
				<tbody>
					<tr>
						<td>${books.bookId}</td>
						<td>${books.bookTitle}</td>
						<td>${books.bookAuthor}</td>
						<td>${books.bookPublication}</td>
						<td>${books.bookGenre}</td>
						<td>${books.bookType}</td>
						<td><img alt="No Photo" width="100 height=300" src="data:image/jpg;base64,${books.bookCoverPic}"></img></td>
						<td>${books.bookQuantity}</td>
						<td>${books.bookBorrow}</td>
						<td>${books.dateOfentry}</td>
					</tr>
					</tbody>
		</table>
		<a class="button" href="/SecPage">Home Page</a>
	</div>
</body>
</html>
