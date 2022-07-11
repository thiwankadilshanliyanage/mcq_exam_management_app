<%-- 
    Document   : addExam
    Created on : Jun 23, 2022, 11:23:33 PM
    Author     : Thiwanka
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <!--CSS file -->
        <link type="text/css" rel="stylesheet" href="css/exam.css">

        <title>Add Exam</title>

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

            <!--search -->
            <input class="col-3" type="search" placeholder="Search" aria-label="Search" id="myinput" onkeyup='tableSearch()'>
            <form action="addQuestion.jsp"><button type="submit" class="qbtn btn btn-primary btn-lg" >New Exam</button></form>
        </div><br><br>
        <form  method="" action=""> 
        <div class="table-responsive" id="no-more-tables">
            <table class="table bg-white" id="mytable">
                <thead class="bg-dark text-light">
                    <tr>
                        <th>Exam</th>
                        <th>Last Updated</th>
                        <th>Status</th>
                        <th>Edit</th>

                    </tr>
                </thead>
                <%
                    try {
                        Connection con;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                        System.out.println("Connected Success");

                        String qry = "select * from mcq_manage_app.exam";
                        PreparedStatement ps = con.prepareStatement(qry);

                        ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                            String exam = rs.getString("e_name");
                            String lastupdated = rs.getString("e_date_time");
                            String status = rs.getString("pub_or_pend");
                            String id = rs.getString("id");

                            System.out.println(exam);
                            System.out.println(lastupdated);
                            System.out.println(status);
                            
                            
//                            

                %>
                <tr>
                    <td data-title="Exam"><%= rs.getString("e_name")%></td>
                    <td data-title="Last Updated"><%= rs.getString("e_date_time")%></td>
                    <td data-title="Status"><%= rs.getString("pub_or_pend")%></td>
                    <td class="text-center">
                        <a href="updateExam.jsp?u=<%=rs.getString("id")%>" class="btn btn-primary">Update</a>
                    </td>
                </tr>                               
                <%
                        }

                    } catch (Exception e) {
                    }
                %>
        </div>
    </section>
    </form>
    <script type="text/javascript">
        function tableSearch() {
            let input, filter, table, tr, td, i, txtValue;
            console.log("is this working");
            
            input = document.getElementById("myinput");
            filter = input.value.toUpperCase();
            table = document.getElementById("mytable");
            tr = table.getElementsByTagName("tr");
            
            for(let i=0; i<tr.length; i++){
                td = tr[i].getElementsByTagName("td")[0];
                if(td){
                    txtValue = td.textContent || td.innerText;
                    if(txtValue.toUpperCase().indexOf(filter)>-1){
                        tr[i].style.display = "";
                    }else{
                        tr[i].style.display = "none";
                    }
                }
            }
        }
    </script>
</body>
</html>
