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
@WebServlet(name = "update_exam", urlPatterns = {"/update_exam"})
public class update_exam extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        
        String eid = (String)session.getValue("exam_id");
        RequestDispatcher rd = request.getRequestDispatcher("addQuestion.jsp");
        rd.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ename = request.getParameter("exam");
        String duration = request.getParameter("duration");
        String status = request.getParameter("status");
        String date_time = request.getParameter("date_time");
        String id = request.getParameter("id");
        
        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
            System.out.println(con);
            PreparedStatement ps = con.prepareStatement("update exam set `e_name`=?, `e_duration`=?, `e_date_time`=?, `pub_or_pend`=? where `id`=?");
            ps.setString(1, ename);
            ps.setString(2, duration);
            ps.setString(3, date_time);
            ps.setString(4, status);
            ps.setString(5, id);
            ps.executeUpdate();
            response.sendRedirect("addExam.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
}
