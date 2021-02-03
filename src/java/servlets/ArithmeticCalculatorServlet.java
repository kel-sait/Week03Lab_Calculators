
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 735815
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
     
    int result = 0;
        
        String num1 = request.getParameter("num_1");   
        request.setAttribute("Num1", num1);
        
        
        String num2 = request.getParameter("num_2");   
        request.setAttribute("Num2", num2);
        
        String operator = request.getParameter("operator_");
        request.setAttribute ("Operator", operator);
        
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
   
     
        //call the form once again, so the user can re-fill the file
        if (num1 == null || num1.equals("") || num2 == null || num2.equals("")){
        //add message
        request.setAttribute("message", "invalid");
        }
      
        if (operator.equals("+")) {
                result = x + y;
                request.setAttribute("message2", "Result: "  +result);
        }
             
        if (operator.equals("-")) {
                result = x - y;
                request.setAttribute("message2", "Result: "  +result);
        }
               
        if (operator.equals("*")) {
            result = x * y;
            request.setAttribute("message2", "Result: "  +result);
        }
                     
        if (operator.equals ("%")) {
            result = x % y;    
            request.setAttribute("message2", "Result: "  +result);
        } 

          //if the form has been filled out correctly, show the next page
        //vai p essa pagina
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
        request.setAttribute("message5", "Result= "+result);
        
        return;

    }
}

