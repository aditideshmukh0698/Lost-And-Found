<%-- 
    Document   : suc
    Created on : 31 Mar, 2019, 5:55:36 PM
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
        <%  if (session != null) {
			if (session.getAttribute("user") != null) {
				String name = (String) session.getAttribute("user");
                                String name1 = (String) session.getAttribute("user1");
				out.print( name+ ""+name1 );
			} else {
				response.sendRedirect("index.html");
			}
		} 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","mysql");
            PreparedStatement ps=null;
           // PreparedStatement ps=null;
           String asd=request.getParameter("things");
            String model=request.getParameter("model");
               String brand=request.getParameter("brand");
               String color=request.getParameter("color");
               String type=request.getParameter("security");
               String where=request.getParameter("where");
               String dat=request.getParameter("dat");
               
               
               
               ps=con.prepareStatement("insert into Lost (ItemId,Name,Brand,Color,Security,Wheree,Whenn,Dipatched) values (101,?,?,?,?,?,?,'N');");
               ps.setString(1, model);
           ps.setString(2, brand);
           ps.setString(3, color);
           ps.setString(4, type);
           ps.setString(5, where);
           ps.setString(6, dat);
           ps.executeUpdate();
          // out.println(asd);
           %>
           
              </body>
</html>
