<%-- 
    Document   : addQuestion
    Created on : Jun 23, 2022, 7:59:26 PM
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

    <title>Add Questions</title>
</head>
<body>
    <div class="qlist  ">
        <section class=" sec">
            <div class="d-inline ">
                <button type="button" class="btn btn-labeled btn-default">
                    <i class="fa fa-chevron-left"></i></button>
                <span class="btn-label exname">Exam Name</span><br><br></div>
            <span class="d-grid gap-2 d-md-flex justify-content-md-end">
                <h5 class="question">Question List</h5>
                <button type="button" class="qbtn btn btn-primary btn-lg">Add Questions</button>
            </span>
            <br>
            <div class="table-responsive" id="no-more-tables">
                <table class="table bg-white">
                    <thead class="bg-dark text-light">
                        <tr>
                            <th>Exam</th>
                            <th>Last Updated</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td data-title="Exam">What is your name?</td>
                            <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                        </tr>                        
                    </tbody>
                </table>
            </div>
            <form method="post" action="addexam">
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Exam Name</label>
                    <div class="col-sm-4">
                        <div class="input-group date" id="duration">
                            <input name="exam" type="text" class="form-control" placeholder="Exam Name">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Date & Time</label>
                    <div class="col-sm-4">
                        <div class="input-group date" id="duration">
                            <input name="date_time" type="datetime-local" class="form-control" placeholder="Exam Date & Time" >
                        </div>
                    </div>
                </div>
                <br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Exam Duration</label>
                    <div class="col-sm-4">
                        <div  class="input-group date" id="duration">
                            <input name="duration" type="number" class="form-control" placeholder="Minutes">
                        </div>
                    </div>
                </div>
                <br>
                <div class="row form-group">
                    <label for="date" class="col-sm-2 col-form-label">Publish/Pending</label>
                    <div class="col-sm-4">
                        <select name="status" class="form-select" aria-label="Default select example">
                            <option selected>Publish</option>
                            <option>Pending</option>
                        </select>
                    </div>
                </div>
                <br>
                <div class="-grid gap-2 d-md-flex justify-content-md-end">
                    <input type="submit" name="update" class="btn btn-outline-success" value="Update"/>
                    <input type="submit" name="save" class="btn btn-primary" value="Save Paper">
                    <input type="submit" name="publish" class="btn btn-success" value="Publish Paper">
                </div>   
            </form>
        </section>

    </div>
    <div class="w-50 p-3 ccc border addquestiondiv">
        <form action="add_question" method="post">
            <div class="row g-2">
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <label name="q1" class="col-form-label">Select Exam</label>
                    </div>
                    <div class="col-sm-4">
                        <select name="exam" class="form-select" aria-label="Default select example">
                            <%
                                try {
                                    Connection con;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                                    Statement st = con.createStatement();
                                    String query = "select * from exam";
                                    ResultSet rs = st.executeQuery(query);
                                    while (rs.next()) {

                            %>
                            <option><%=rs.getString("e_name")%></option>
                            <%
                                    }
                                } catch (Exception e) {

                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="col-md">
                    <input name="q_no" type="number" class="form-control" placeholder="Number">
                </div>
                <div class="col-md col-xs-2">
                    <input name="q" type="text" class="form-control" placeholder="Question">
                </div>
            </div><br> <div class="col-md-12 text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form></div><br><br><br><br>


    <div class="w-50 p-3 border addquestionanswerdiv">
        <form>
            <div class="col-md">
                <select name="exam_name" id="exam_name" onclick="select2();" onchange="this.form.submit();" class="form-select" aria-label="Default select example">
                    <option value="0">Select Exam</option>
                    <%
                        try {
                            Connection con;
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                            Statement st = con.createStatement();
                            String query = "select * from exam";
                            ResultSet rs = st.executeQuery(query);
                            while (rs.next()) {
                    %>
                    <option value="<%=rs.getInt("id")%>"                           
                            <%
                                if (request.getParameter("exam_name") != null) {
                                    if (rs.getInt("id") == Integer.parseInt(request.getParameter("exam_name"))) {
                                        out.print("Selected");
                                    }
                                }
                            %>

                            ><%=rs.getString("e_name")%></option>
                    <%
                            }
                        } catch (Exception e) {

                        }
                    %>
                </select>
            </div>
            <br>
            <div class="col-md col-xs-2">
                <select name="" id="Q" onchange="select();" class="form-select" aria-label="Default select example">
                    <option value="0">Select Question</option>
                    <%
//                        String examselector = request.getParameter("exam_name");
//                        System.out.println(examselector);
                        Connection con;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                        Statement st = con.createStatement();
                        String query = "select * from question where `exam_id`=?";
                        PreparedStatement psmt = con.prepareStatement(query);
                        psmt.setString(1, request.getParameter("exam_name"));

                        ResultSet rs = psmt.executeQuery();
                        while (rs.next()) {
                    %>
                    <option value="<%=rs.getInt("id")%>"><%=rs.getString("question")%></option>
                    <%
                        }
                    %>
                </select>
            </div>
        </form>
        <br>
        <form action="add_answers" method="post">
            <div class="row g-3 align-items-center">
                <div class="col-auto width">
                    <input style="border: none;
                           background-color: transparent;
                           color: transparent;
                           resize: none;
                           outline: none;" name="question" id="textvalue" type="text" >
                </div>
            </div>
            <div class="row g-3 align-items-center">
                <div class="col-auto width">
                    <input style="border: none;
                           background-color: transparent;
                           color: #333232;
                           resize: none;
                           outline: none;" name="exam" id="textvalue2" type="text" >
                </div>
            </div><br>
            <div class="row g-3 align-items-center">
                <div class="col-auto">
                    <label name="q1" class="col-form-label">1.</label>
                </div>
                <div class="col-auto width">
                    <input name="answer_1" type="text" class="form-control" placeholder="Answer 1">
                </div>
            </div><br>
            <div class="row g-3 align-items-center">
                <div class="col-auto">
                    <label class="col-form-label">2.</label>
                </div>
                <div class="col-auto width">
                    <input name="answer_2" type="text" class="form-control" placeholder="Answer 2">
                </div>
            </div><br>
            <div class="row g-3 align-items-center">
                <div class="col-auto">
                    <label  class="col-form-label">3.</label>
                </div>
                <div class="col-auto width">
                    <input name="answer_3" type="text"  class="form-control" placeholder="Answer 3">
                </div>
            </div><br>
            <div class="row g-3 align-items-center">
                <div class="col-auto">
                    <label class="col-form-label">4.</label>
                </div>
                <div class="col-auto width">
                    <input name="answer_4" type="text" class="form-control" placeholder="Answer 4">
                </div>
            </div><br>
            <div class="col-sm-4">
                <select name="correct" class="form-select" aria-label="Default select example">
                    <option selected>Select Correct Answer</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                </select>
            </div>
            <br> <div class="col-md-12 text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>

    <script type="text/javascript">
        $(function () {
            $('#datepicker').datepicker();
        });

        config = {
            enableTime: true,
            dateFormat: "Y-m-d H:i",
            altInput: true,
            altFormat: "F j, Y (h:S K)"
        }

        flatpickr("input[type=datetime-local]", config);

        function select() {
            var d = document.getElementById("Q");
            var displaytext = d.options[d.selectedIndex].text;
            document.getElementById("textvalue").value = displaytext;
        }
        function select2() {
            var e = document.getElementById("exam_name");
            var displaytext = e.options[e.selectedIndex].text;
            document.getElementById("textvalue2").value = displaytext;
        }
    </script>
    <script type="text/javascript" src="js/timepick.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">
</body>
</html>
