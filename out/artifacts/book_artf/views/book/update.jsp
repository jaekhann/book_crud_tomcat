<%--
  Created by IntelliJ IDEA.
  User: jaxongir
  Date: 22/09/24
  Time: 01:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Update Page</title>
</head>
<body>
    <h1>Book Update</h1>
    <ul>
        <li>${book.id}</li>
        <li>${book.title}</li>
        <li>${book.author}</li>
        <li>${book.pages}</li>
    </ul>
    <br>
    <p>Enter update details: </p>
    <form method="post">
        <div>
            <label for="title"> Book title :</label>
            <input type="hidden" name="id" value=<% request.getParameter("id"); %> >
            <br>
            <input type="text" name="title" id="title" placeholder="Sariq Dev">
            <br>

            <label for="author"> Book Author :</label>
            <br>
            <input type="text" name="author" id="author" placeholder="G'ofur G'ulom">
            <br>

            <label for="pages"> Book Page Count :</label>
            <br>
            <input type="number" min="2" name="pages" id="pages">
            <br>
                <a href="/book_crud/book/list" style="color: orange">back</a>
                <br>
                <input type="submit" value="update">
        </div>
    </form>

</body>
</html>

<%--<input type="hidden"--%>
<%--       name="id"--%>
<%--       value=<%--%>
<%--                   Integer.parseInt(request.getRequestURI().--%>
<%--                   substring(request.getRequestURI().lastIndexOf('/') + 1)); %>--%>
<%-->--%>