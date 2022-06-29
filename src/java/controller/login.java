/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thiwanka
 */
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
      String email = request.getParameter("email");
      String password = request.getParameter("pw");
      int role_id = 1;
      String role = Integer.toString(role_id);

        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app","root","thiwanka123");
            System.out.println("Connected Success");
            
            String sql = "select * from mcq_manage_app.user where email=? password=? and role_id=?";
            
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, role);
            
            
            
            String emailDB = "";
            String passDB = "";
            String roleDB = "";
            
            
            
            ResultSet rs = ps.executeQuery();
            
            
           
            
            while (rs.next()) {
                emailDB = rs.getString("email");
                passDB = rs.getString("password");
                roleDB = rs.getString("role_id");
                
                System.out.println("Database email :::"+emailDB);
                System.out.println("Database password :::"+passDB);
                System.out.println("Database role_id :::"+roleDB);
            }
            if(email.equals(emailDB) && password.equals(passDB) && role.equals(roleDB)){
                System.out.println("inside IFF");
                
                RequestDispatcher rd = request.getRequestDispatcher("addExam.jsp");
                rd.forward(request, response);
            }else{
                System.out.println("INSIDE ELSE");
                 RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
            
        } catch (Exception e) {
            System.out.println("Error From LOGIN PART ::"+e.getMessage());
        }
      
      
    }

    
}
