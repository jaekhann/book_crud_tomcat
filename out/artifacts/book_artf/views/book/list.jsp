<%--
  Created by IntelliJ IDEA.
  User: jaxongir
  Date: 21/09/24
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Book list Page</title>
</head>
<body>
<h1 style="text-align: center; color: green; margin-top: 30px;">Book list</h1>
<a href="/book_crud/book/add">add book</a>
<br>
<c:if test="${not empty books}">
    <table cellpadding="10" cellspacing="0" border="1">
        <thead>
        <tr>
            <th>#</th>
            <th>title</th>
            <th>author</th>
            <th>page count</th>
            <th>action</th>
        </tr>
        </thead>
        <tbody>
        <c:set var="index" value="1"/>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${index}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.pages}</td>
                <td>
                    <a href="/book_crud/book/delete/${book.id}"> delete book</a> ||
                    <a href="/book_crud/book/update/${book.id}"> update book</a>
                </td>
            </tr>
            <c:set var="index" value="${index + 1}"/>
        </c:forEach>
        </tbody>
    </table>
</c:if>
<c:if test="${empty books}">
    <h1>Book is not found!</h1>
</c:if>
</body>
</html>
