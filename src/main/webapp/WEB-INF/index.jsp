<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Discover extraordinary NFTs </h1>
<table class="table table-dark">
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Title</th>
                <th scope="col">Description</th>
            </tr>
        </thead>
    <tbody>
    <c:forEach items="${allArts}" var="art">
    <tr class="table-primary">
        <td  class="table-secondary"> <c:out value="${art.title}"/></td>
        <td  class="table-secondary"><c:out value="${art.description}"/></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>