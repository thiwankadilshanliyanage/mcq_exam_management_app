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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thiwanka
 */
@WebServlet(name = "addexam", urlPatterns = {"/addexam"})
public class addexam extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        
        String uid = (String)session.getValue("user_id");
        RequestDispatcher rd = request.getRequestDispatcher("addExam.jsp");
        rd.forward(request, response);
        
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
        HttpSession session = request.getSession(true);
        String uid = (String)session.getValue("user_id");
        System.out.println(uid);
        
        
        
        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
            System.out.println(con);
        } catch (Exception e) {
        }
        
        
         String cap = request.getParameter("publish");
        if(cap.equals("Publish Paper")){
            
        String e_name = request.getParameter("exam");
        String e_date = request.getParameter("date");
        String e_time = request.getParameter("time");
        String e_duration = request.getParameter("duration");
        
        System.out.println(e_name);
        System.out.println(e_date);
        System.out.println(e_time);
        System.out.println(e_duration);
        }
    }


}
