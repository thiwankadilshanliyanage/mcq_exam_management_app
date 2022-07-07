/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiwanka
 */
@WebServlet(name = "add_question", urlPatterns = {"/add_question"})
public class add_question extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String q_no = request.getParameter("q_no");
        String q = request.getParameter("q");
        String answer_1 = request.getParameter("answer_1");
        String answer_2 = request.getParameter("answer_2");
        String answer_3 = request.getParameter("answer_3");
        String answer_4 = request.getParameter("answer_4");
        String correct = request.getParameter("correct");
        String Exam = request.getParameter("exam");
        String exam_id = null;

//        System.out.println(q_no);
//        System.out.println(q);
//        System.out.println(answer_1);
//        System.out.println(answer_2);
//        System.out.println(answer_3);
//        System.out.println(answer_4);
//        System.out.println(correct);
//        System.out.println(Exam);

        try {
            
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
        Statement st = con.createStatement();
        String query = "select * from exam where `e_name`='"+Exam+"'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                exam_id = rs.getString("id");
//                System.out.println(exam_id);
            }
            PreparedStatement ps = con.prepareStatement("insert into mcq_manage_app.question(`q_no`,`question`,`exam_id`)values(?,?,?)");
            ps.setString(1, q_no);
            ps.setString(2, q);
            ps.setString(3, exam_id);
            ps.execute();
            response.sendRedirect("addQuestion.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
