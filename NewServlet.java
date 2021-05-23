

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body> hi\n");
            String dev=request.getParameter("things");
            if(dev.equals("Comp"))
            {
                out.println("<form action='index.html'> Name: <input type=\"text\" required> ");   
                out.println("<br><br>Brand:<select name='brand' required>  <option value='' selected disabled hidden>  </option>");
                out.println("<option value='Dell'>Dell</option>");
                out.println("<option value='HP'> HP </option></select>");
                out.println("<br><br>Colour:<select name='color'><option value='selec' selected disabled hidden> Select </option>");
                out.println("<option value='black'>Black</option><option value='white'>White</option> </select>");
                
                out.println("<br><br>Where:<select name='where'>  <option value='selec' selected disabled hidden> Select </option>");
                out.println("<option value='class'>Class</option>");
                out.println("<option value='ground'> Ground </option></select>");
                out.println("<br><br>Security Type:<select name='security'>  <option value='selec' selected disabled hidden> Select </option>");
                out.println("<option value='password'>Password</option>");
                out.println("<option value='pin'> Pin </option></select>");
                out.println("<br><br>Date:<input type=\"date\" required");
                out.println("<br><br><br><input type='submit' value='Submit'");
                out.println("</form>");
             
            }
            else
                
                out.println("pipipipijjojojoj");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
