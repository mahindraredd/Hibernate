<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
<h1>Welcome to the Employee Form</h1>
<center>
<form:form modelAttribute="emp" action="result" method="post">
    <table border="1">
        <tr>
            <th>Employee Name</th>
            <td>
                <form:input path="ename" />
            </td>
        </tr>
        <tr>
            <th>Employee Number</th>
            <td>
                <form:input path="eno" />
            </td>
        </tr>
        <tr>
            <th>Employee Age</th>
            <td>
                <form:input path="eage" />
            </td>
        </tr>
        <tr>
            <th>Employee Address</th>
            <td>
                <form:input path="eaddress" />
            </td>
        </tr>
        <tr>
            <th>Employee Salary</th>
            <td>
                <form:input path="esal" />
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <input type="submit" value="Submit"/>
            </th>
        </tr>
    </table>
</form:form>
</center>
</body>
</html>
