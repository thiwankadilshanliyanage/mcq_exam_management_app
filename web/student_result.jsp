<%-- 
    Document   : student_result
    Created on : Jun 28, 2022, 7:33:55 PM
    Author     : Thiwanka
--%>

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
        <link rel="stylesheet" type="text/css" href="css/result.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-inline exnamediv ">
            <button type="button" class="btn btn-labeled btn-default">
                <i class="fa fa-chevron-left"></i></button>
            <span class="btn-label exname">Exam Name</span><br><br></div>

        <div class="container justify-content-center d-flex maindiv">
            <div class="col-6">
                <div class="col-6">
                    <div class="row g-2">
                        <div class="col-12">
                            <!--DIV 1-->
                            <div class="p-3 border  div1">  
                                <p class="lead">
                                    Exam Completed
                                </p>
                                <p class="status">
                                    Passed
                                </p><br>
                                <p class="grade">
                                    Grade & Point
                                </p>
                            </div>
                        </div>
                        <!--DIV 2-->
                        <div class="col-12">
                            <div class="p-3 border div2">
                                <p class="lead">
                                    Questions
                                </p>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">Q No</th>
                                            <th scope="col">Question</th>
                                            <th scope="col">Answer</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><br>
        <button type="button" class="btn btn-secondary closebtn">Close</button>
    </body>
</html>
