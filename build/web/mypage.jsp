<%-- 
    Document   : mypage
    Created on : Nov 21, 2018, 1:11:52 AM
    Author     : samit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This my page</title>
    </head>
    <body>
        <h1>Hello My Web page!</h1>
        <form name="myform" method="post" action="ShowData">
            <label>Fullname:</label>
            <input type="text" name="fullname">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
