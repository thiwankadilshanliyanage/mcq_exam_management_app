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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiwanka
 */
@WebServlet(name = "add_answers", urlPatterns = {"/add_answers"})
public class add_answers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String exam = request.getParameter("exam");
        String question = request.getParameter("question");
        String a1 = request.getParameter("answer_1");
        String a2 = request.getParameter("answer_2");
        String a3 = request.getParameter("answer_3");
        String a4 = request.getParameter("answer_4");
        String CA = request.getParameter("correct");
        String no_1 = "1";
        String no_2 = "2";
        String no_3 = "3";
        String no_4 = "4";
        String q_id = null;
        String e_id = null;

        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
            Statement stmnt = con.createStatement();
            String query = "select * from question where `question`='"+question+"'";
            ResultSet rs = stmnt.executeQuery(query);
            if(rs.next()){
                q_id = rs.getString("id");
            }
            Statement stmnt2 = con.createStatement();
            String query2 = "select * from exam where `e_name`='"+exam+"'";
            ResultSet rs2 = stmnt2.executeQuery(query2);
            if(rs2.next()){
                e_id = rs2.getString("id");
            }
            
            
            PreparedStatement ps1 = con.prepareStatement("insert into mcq_manage_app.answer(`answer`,`answer_no`,`question_id`,`exam_id`,`correct_answer`)values(?,?,?,?,?)");
                    ps1.setString(1,a1);
                    ps1.setString(2,no_1);
                    ps1.setString(3,q_id);
                    ps1.setString(4,e_id);
                    ps1.setString(5,CA);
                    ps1.execute();
            PreparedStatement ps2 = con.prepareStatement("insert into mcq_manage_app.answer(`answer`,`answer_no`,`question_id`,`exam_id`,`correct_answer`)values(?,?,?,?,?)");
                    ps2.setString(1,a2);
                    ps2.setString(2,no_2);
                    ps2.setString(3,q_id);
                    ps2.setString(4,e_id);
                    ps2.setString(5,CA);
                    ps2.execute();
            PreparedStatement ps3 = con.prepareStatement("insert into mcq_manage_app.answer(`answer`,`answer_no`,`question_id`,`exam_id`,`correct_answer`)values(?,?,?,?,?)");
                    ps3.setString(1,a3);
                    ps3.setString(2,no_3);
                    ps3.setString(3,q_id);
                    ps3.setString(4,e_id);
                    ps3.setString(5,CA);
                    ps3.execute();
            PreparedStatement ps4 = con.prepareStatement("insert into mcq_manage_app.answer(`answer`,`answer_no`,`question_id`,`exam_id`,`correct_answer`)values(?,?,?,?,?)");
                    ps4.setString(1,a4);
                    ps4.setString(2,no_4);
                    ps4.setString(3,q_id);
                    ps4.setString(4,q_id);
                    ps4.setString(5,CA);
                    ps4.execute();
                    response.sendRedirect("addQuestion.jsp");
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
