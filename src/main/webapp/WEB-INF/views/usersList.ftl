<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Users</title>
</head>
<body>
<h1>Users list</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
<#list users as user>
    <tr>
        <td><a href="/user/${user.id}">${user.id}</a></td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.age}</td>
        <td><a href="/delete/${user.id}" >Delete user</a> </td>
        <td><a href="/update/${user.id}">Edit user</a> </td>
    </tr>
</#list>
</table>
<a href="/addUser" >Create user</a>
</body>
</html>