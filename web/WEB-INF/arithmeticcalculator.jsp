<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 31, 2021, 4:07:26 PM
    Author     : 735815
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
 
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            
          <label>First: </label>
            <input type="text" name="num_1" value="" >   
            <br>
             <label>Second: </label>
             <input type="text" name="num_2" value=""> 
               <br>
               
               
               <input type="submit"   name="operator_" value="+">
               <input type="submit"   name="operator_"  value="-">
               <input type="submit"   name="operator_"  value="*"> 
               <input type="submit"   name="operator_" value="%">   

             
               <br>
               
               Result:
               <span id='result'></span>
                

               <p>${message}${""}</p>
  
           <p>${message2}${Num1+Num2}</p>      
  
            <p>${message3}${Num1-Num2}</p>   
                   
            <p>${message4}${Num1*Num2}</p>   
        
            <p> ${message5}${Num1%Num2}</p>   
             
         
                     
            

            
    
                     
            <a href="agecalculator" target="_blank">
                <br>Age Calculator</a>
                  
 
              </form>    
    </body>
</html>



              