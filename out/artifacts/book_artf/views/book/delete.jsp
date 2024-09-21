<%--
  Created by IntelliJ IDEA.
  User: jaxongir
  Date: 21/09/24
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Book Delete Page</title>
</head>
<body>
<h1 style="text-align: center; color: white; background-color: darkred; margin-top: 30px;">Book delete Page</h1>
<ul>
    <li>${book.id}</li>
    <li>${book.title}</li>
    <li>${book.author}</li>
    <li>${book.pages}</li>
</ul>
<p>Are you sure to delete this book ?</p>
<form method="post">
    <a href="/book_crud/book/list" style="color: orange">back</a>
    <br>
    <input type="submit" value="yes">
</form>

</body>
</html>
