<%-- 
    Document   : agecalculator
    Created on : Jan 28, 2021, 6:17:49 PM
    Author     : 735815
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Form</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="agecalculator">
            <label> Enter your age: </label>
            <input type="text" name="age_user" value="" >           
            <p>${message}</p>
            
            <p>${message2}${Age+1}</p>
  
            <input type="submit" value="Age next birthday">    
           
            <a href="arithmetic" target="_blank">
                <br>Arithmetic Calculator</a>
  
        </form>        
    </body>
</html>
