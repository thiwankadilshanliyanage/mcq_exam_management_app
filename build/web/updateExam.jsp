<%-- 
    Document   : updateExam
    Created on : Jul 11, 2022, 12:30:21 PM
    Author     : Thiwanka
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
        <link type="text/css" rel="stylesheet" href="css/addQ.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
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
    <title>Update Exam</title>
</head>
<body>
    <%
        String u = request.getParameter("u");
        Integer examid = Integer.parseInt(u);
        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from exam where `id`='" + examid + "'");

    %>
    <div class="w-50 container" style="margin-top: 100px;">
        <div class="container">
            <form method="post" action="update_exam">
                <%
                while(rs.next()){
                    
               
                %>
                <button type="button" class="btn btn-labeled btn-default">
                    <i class="fa fa-chevron-left"></i></button>
                    <span class="btn-label exname"><%=rs.getString("e_name")%></span><br><br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Exam Name</label>
                    <div class="col-sm-4">
                        <div class="input-group date" id="duration">
                            <input name="exam" type="text" class="form-control" placeholder="Exam Name" value="<%out.print(rs.getString("e_name"));%>">
                            <input name="id" type="text" class="form-control" hidden placeholder="Exam Name" value="<%out.print(rs.getString("id"));%>">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Date & Time</label>
                    <div class="col-sm-4">
                        <div class="input-group date" id="duration">
                            <input name="date_time" type="datetime-local" class="form-control" placeholder="Exam Date & Time" value="<%out.print(rs.getString("e_date_time"));%>">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Exam Duration</label>
                    <div class="col-sm-4">
                        <div  class="input-group date" id="duration">
                            <input name="duration" type="number" class="form-control" placeholder="Duration"  value="<%out.print(rs.getString("e_duration"));%>">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Publish/Pending</label>
                    <div class="col-sm-4">
                        <select name="status" value="<%out.print(rs.getString("pub_or_pend"));%>" class="form-select" aria-label="Default select example">
                            <option selected>Publish</option>
                            <option>Pending</option>
                        </select>
                    </div>
                </div>
                <br>
                <div class="-grid gap-2 d-md-flex justify-content-md-end">
                    <input type="submit" name="publish" class="btn btn-success" value="Update Paper">
                </div>   
            </form>
        </div>
    </div>
    <%   }  } catch (Exception e) {
            e.printStackTrace();
        }
    %>
</body>
</html>
