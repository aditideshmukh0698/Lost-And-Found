<%-- 
    Document   : newjsp
    Created on : 31 Mar, 2019, 1:10:20 PM
    Author     : hp
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% 
            

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","mysql");
            PreparedStatement ps=null;
            String dev=request.getParameter("things");
            String butt=request.getParameter("butto");
            if(dev.equals("Comp"))
            {
                %>
                <p style='font-size: 150%;text-align: center;'>COMPUTER</p>
                <form action='suc.jsp'> Model: <input type="text" name="model" placeholder="Enter name of model" required>    
                <br><br>Brand:<select name='brand' required>  <option value='select' selected disabled hidden> Select </option>
               <option value='Dell'>Dell</option>
                <option value='HP'> HP </option></select>
                <br><br>Colour:<select name='color'><option value='select' selected disabled hidden> Select </option>
              <option value='black'>Black</option><option value='white'>White</option> </select>
                
                <br><br>Where:<select name='where'>  <option value='select' selected disabled hidden> Select </option>
                <option value='class'>Class</option>
               <option value='ground'> Ground </option></select>
                <br><br>Security Type:<select name='security'>  <option value='select' selected disabled hidden> Select </option>
                <option value='password'>Password</option>
             <option value='pin'> Pin </option></select>
                <br><br>Date:<input type="date" name="dat" required
                                    <br><br><br><input type='submit' value='Submit'>
               </form>
                <%  
                    //HttpSession se[] ;
                   
                   session.setAttribute("user", dev);
                    session.setAttribute("user1", butt);
                    //response.sendRedirect("suc.jsp");
                   // RequestDispatcher rd=request.getRequestDispatcher("suc.jsp");
                    //rd.include(request, response);
           
           
         }
            else if(dev.equals("Mobile")){
           %>  
            <p style='font-size: 150%;text-align: center;'>MOBILE</p>
                <form action='index.html'> Model: <input type="text" placeholder="Enter name of model" required>    
                <br><br>Brand:<select name='brand' required>  <option value='select' selected disabled hidden> Select </option>
               <option value='MI'>MI</option>
                <option value='Apple'> Apple </option></select>
                <br><br>Colour:<select name='color'><option value='select' selected disabled hidden> Select </option>
              <option value='black'>Black</option><option value='white'>White</option> </select>
                
                <br><br>Where:<select name='where'>  <option value='select' selected disabled hidden> Select </option>
                <option value='class'>Class</option>
               <option value='ground'> Ground </option></select>
                <br><br>Security Type:<select name='security'>  <option value='select' selected disabled hidden> Select </option>
                <option value='password'>Password</option>
             <option value='pin'> Pin </option></select>
                <br><br>Date:<input type="date" required
                                    <br><br><br><input type='submit' value='Submit'>
               </form>
                <%  ps=con.prepareStatement("insert into asd values (8);");
         }
else if(dev.equals("new")) 
{
%>
           <form>
               Name: <input type="text" placeholder="Enter name of the item" required> <br><br>
               Select the attributes which the items posses: <br>
               <input type="checkbox" value="Strap">Strap <br>
               <input type="checkbox" value="Title">Title <br>
               <input type="checkbox" value="Author">Author <br>
               <input type="checkbox" value="Display Type">Display Type <br>
               <input type="checkbox" value="Stone">Stone <br>
               <input type="checkbox" value="Key Chain">Key Chain <br>
               <input type="checkbox" value="Size (in GB)">Size (in GB) <br>
               <input type="checkbox" value="Stone colour">Stone Colour <br>
               
           </form>
            <%  ps=con.prepareStatement("insert into asd values (10);");
           } 
            

          // ps.executeUpdate();
           // ps.close();
           
           %>
    </body>
</html>
