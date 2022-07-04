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
@WebServlet(name = "search", urlPatterns = {"/search"})
public class search extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                        System.out.println("Connected Success");
                        
                        Statement stat = null;
                        ResultSet res = null;
                        stat = con.createStatement();
                        String query = request.getParameter("q");
                        String data;
                        if(query!=null){
                            data="select * from mcq_manage_app.exam where e_name like '%"+query+"%'";
                        }else{
                            data = "select * from mcq_manage_app.exam";
                        }
                        res = stat.executeQuery(data);
                        while (res.next()) {
                        }
        } catch (Exception e) {
        }
    }

  

}
