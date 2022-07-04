/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.user;
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
        String role = "1";
        String roles = "2";
//      user User = null;

        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
            System.out.println("Connected Success");

            String sql = "select * from mcq_manage_app.user where email=? and password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            String emailDB = "";
            String passDB = "";
            String roledb = "";
            String iddb = "";

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                emailDB = rs.getString("email");
                passDB = rs.getString("password");

                roledb = rs.getString("role_id");
                iddb = rs.getString("id");
                String unamedb = rs.getString("u_name");

                System.out.println("Database email :::" + emailDB);
                System.out.println("Database password :::" + passDB);
                System.out.println("Database role :::" + roledb);
                System.out.println("Database id :::" + iddb);
                System.out.println("Database name :::" + unamedb);
            }
            if (role.equals(roledb)) {
                if (email.equals(emailDB) && password.equals(passDB)) {
                    HttpSession s = request.getSession(true);
                    s.putValue("user_id", iddb);
                    response.sendRedirect(request.getContextPath() + "/addexam");
                }
            } else if (roles.equals(roledb)) {
                if (email.equals(emailDB) && password.equals(passDB)) {
                    HttpSession s = request.getSession(true);
                    s.putValue("user_id", iddb);
                    response.sendRedirect(request.getContextPath() + "/student_exams");
                }
            } else {
                System.out.println("INSIDE ELSE");
                RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            System.out.println("Error From LOGIN PART ::" + e.getMessage());
        }

    }

}
