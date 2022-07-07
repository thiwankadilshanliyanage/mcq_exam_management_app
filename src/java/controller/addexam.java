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
import java.sql.Statement;
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

        String uid = (String) session.getValue("user_id");
        RequestDispatcher rd = request.getRequestDispatcher("addExam.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String uid = (String) session.getValue("user_id");
        System.out.println(uid);

        String pub = request.getParameter("publish");
        String save = request.getParameter("save");
        if (pub.equals("Publish Paper")) {

            try {
                String e_name = request.getParameter("exam");
                String e_date_time = request.getParameter("date_time");
                String e_duration = request.getParameter("duration");
                String status = request.getParameter("status");

                Connection con;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                PreparedStatement ps = con.prepareStatement("insert into mcq_manage_app.exam(`e_name`,`e_duration`,`e_date_time`,`user_id`,`pub_or_pend`) values(?,?,?,?,?)");
                ps.setString(1, e_name);
                ps.setString(2, e_duration);
                ps.setString(3, e_date_time);
                ps.setString(4, uid);
                ps.setString(5, status);
                ps.executeUpdate();
                response.sendRedirect("addQuestion.jsp");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (save.equals("Save Paper")) {
            try {
                Connection conn;
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                Statement stmt = conn.createStatement();
                String q = "select * from exam";
                ResultSet rs = stmt.executeQuery(q);
                if(rs.next()){
                    
                }
            } catch (Exception e) {

            }
        }

    }

}
