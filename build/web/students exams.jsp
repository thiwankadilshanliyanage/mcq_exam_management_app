<%-- 
    Document   : students exams
    Created on : Jun 28, 2022, 1:51:00 AM
    Author     : Thiwanka
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link type="text/css" rel="stylesheet" href="css/exam.css">
        <title>Students Exams</title>
        <!--navbar-->

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Dropdown
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Something else here</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav> 
</head>
<body>
    <section class="p-5">
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
            <form class="d-grid gap-2 d-md-flex justify-content-md-end col-3 search" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div><br><br>
        <div class="table-responsive" id="no-more-tables">
            <table class="table bg-white">
                <thead class="bg-dark text-light">
                    <tr>
                        <th>Exam</th>
                        <th>Starting Time</th>
                        <th>Exam Duration</th>
                        <th>Participate</th>
                    </tr>
                </thead>
                <%
                    try {
                        String pubish = "Publish";
                        Connection con;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                        String query = "select * from exam where `pub_or_pend`='"+pubish+"'";
                        PreparedStatement ps = con.prepareStatement(query);
                        ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            %>
                            <td data-title="Exam"><%= rs.getString("e_name")%></td>
                            <td data-title="Starting Time"><%= rs.getString("e_date_time")%></td>
                            <td data-title="Exam Duration"><%= rs.getString("e_duration")%></td>
                            <td data-title="Participate"><input type="submit" value="Go to exam"></td>
                
                            
                            <%
                        }
                    } catch (Exception e) {
                    }
                %>
                </tbody>
            </table>
        </div>
    </section>
</body>
</html>
