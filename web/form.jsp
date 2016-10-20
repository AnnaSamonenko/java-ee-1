<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new shares</title>
    <style>
        form {
            position: absolute;
            top: 30%;
            left: 38%;
        }

        .st {
            width: 300px;
            height: 40px;
        }
    </style>
</head>
<body>
<form method="GET" action="Form">
    <input placeholder="Company" name="company" class="st"><br>
    <input placeholder="Price" name="price" class="st"> <br>
    <input placeholder="Type" name="type" class="st"> <br>
    <input type="submit" value="Submit" class="st"> <br>
</form>
</body>
</html>
