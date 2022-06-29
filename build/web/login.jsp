<%-- 
    Document   : login
    Created on : Jun 22, 2022, 12:44:00 PM
    Author     : Thiwanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap v5.1.3 CDNs -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        
        <!--CSS file -->
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <title>Login</title>
    </head>
    <body>
       <div class="login">

        <h1 class="text-center">Login</h1>
        
        <!--login form-->
        
        <form class="needs-validation" method="post" action="login">
            <div class="form-group was-validated">
                <label class="form-label" for="email">Email address</label>
                <input class="form-control" type="email" name="email" id="email" required>
                <div class="invalid-feedback">
                    Please enter your email address
                </div>
            </div>
            <div class="form-group was-validated">
                <label class="form-label" for="password">Password</label>
                <input class="form-control" type="password" name="pw" id="password" required>
                <div class="invalid-feedback">
                    Please enter your password
                </div>
            </div>
            <input class="btn btn-success w-100" type="submit" value="LOG IN">
        </form>

        <!--login form-->
        
    </div>
    </body>
</html>
