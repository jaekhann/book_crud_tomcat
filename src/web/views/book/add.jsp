<%--
  Created by IntelliJ IDEA.
  User: jaxongir
  Date: 21/09/24
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Add Title</title>
</head>
<body>
    <h1 style="color: green; text-align: center; margin-top: 30px;">Book Add Page</h1>
    <form method="post">
        <div>
            <label for="title"> Book title :</label>
            <input type="hidden" name="id" value=<% request.getParameter("id"); %>
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
            <input type="submit" value="add book">
        </div>
    </form>

</body>
</html>
