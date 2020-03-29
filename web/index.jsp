<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Login</title>
</head>
<body>

  <h1>Login</h1>
  <form action="MainServlet" method="post">
    <label>Username</label>
    <input name="username" type="text">
    <br><label>Password</label>
    <input name="password" type="password">
    <br><input type="submit" value="Login">
  </form>

</body>
</html>