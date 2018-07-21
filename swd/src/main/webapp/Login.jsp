<%-- 
    Document   : Login
    Created on : Jul 21, 2018, 10:44:16 PM
    Author     : Mr.Rabbit
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html
    <jsp:include page="header.jsp"></jsp:include>
    <head>
        <title>Login</title>
    </head>
    <body>
        <div class="wrapper" style="width: 80vh;margin: 0 auto; margin-top: 10%;">
            <form class="form-signin" action="/createUser" method="post" >
                <h2 class="form-signin-heading" style="text-align: center">Login</h2></br>
                 <input type="text" class="form-control" name="username" id="txtUser" placeholder="Username" required="" autofocus=""></br>
                <input type="password" class="form-control" name="password" id="txtPassword" placeholder="Password" required="" autofocus="">          
                <div style="text-align: center; margin: 0 auto; margin-top: 8%">
                    <button class="btn btn-lg btn-primary" formaction="Register" style="width: 50%" type="submit" value="Register">OK</button>
                </div>
            </form>
        </div>



    </body>
</html>