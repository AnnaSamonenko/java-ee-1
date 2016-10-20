<%@ page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<html>
<head>
    <title>Shares</title>
    <style>
        h1 {
            text-align: center;
        }

        table {
            position: absolute;
            left: 25%;
            border-collapse: collapse;
            border: 1px solid lightgrey;
            text-align: center;
        }

        th, td {
            width: 150px;
            height: 45px;
            border: 1px solid lightgrey;
        }

        th {
            background-color: lightgrey;
        }

        a {
            color: black;
        }
    </style>
</head>
<body>
<%
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/shares?useSSL=false", "root", "root");

    Statement statement = connection.createStatement();
    ResultSet resultset =
            statement.executeQuery("select * from Shares");
%>
<h1> Shares </h1>
<table>
    <tr>
        <th>ID</th>
        <th>Company</th>
        <th>Price</th>
        <th>Type</th>
    </tr>
    <% while (resultset.next()) { %>
    <tr>
        <td><%= resultset.getString(1) %>
        </td>
        <td><%= resultset.getString(2) %>
        </td>
        <td><%= resultset.getDouble(3) %>
        </td>
        <td><%= resultset.getString(4) %>
        </td>
    </tr>
    <% } %>
    <tr>
        <td colspan="4"><br><a href="form.jsp">Add new field</a></td>
    </tr>
</table>
</body>
</html>