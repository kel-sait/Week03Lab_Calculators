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
public class AgeCalculatorServlet extends HttpServlet {

 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         
        
        String age = request.getParameter("age_user");        
        request.setAttribute("Age", age);
        
     
        //call the form once again, so the user can re-fill the file
        if (age == null || age.equals("")){
        //add message
        request.setAttribute("message", "You must give your current age.");
        }
        
        
       
        else {
                 request.setAttribute("message2", "Your next age birthday will be ");
                }
        
        
           //if the form has been filled out correctly, show the next page
        //vai p essa pagina
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        
        return;
            
        
  
    }
}