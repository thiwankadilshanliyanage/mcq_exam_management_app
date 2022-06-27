<%-- 
    Document   : exam_detail
    Created on : Jun 24, 2022, 10:33:25 PM
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
        <link type="text/css" rel="stylesheet" href="css/exam_detail.css">
        <title>JSP Page</title>
    </head>
    <body>
        <button type="button" class="btn btn-labeled btn-default">
            <i class="fa fa-chevron-left"></i></button>
        <span class="btn-label exname">Exam Name</span>  
        <div class="container">
            <div class="row">
                <div class="col-6">
                    <div class="row g-2">
                        <div class="col-12">
                            <!--DIV 1-->
                            <div class="p-3 border  div1">
                                <p class="lead">
                                    Exam Completed
                                </p>
                                <h1 class=" d-flex justify-content-center atend" >10/20</h1>          
                                <!--counter-->
                                <div class="wrapper">
                                    <div class="">
                                        <h1 class="title">Time Left</h1>
                                        <div class="countdown-container">
                                            <div>
                                                <p id="days" class="big-text">0</p>
                                                <span>Days</span>
                                            </div>
                                            <div>
                                                <p id="hours" class="big-text">0</p>
                                                <span>Hours</span>
                                            </div>
                                            <div>
                                                <p id="min" class="big-text">0</p>
                                                <span>Min</span>
                                            </div>
                                            <div>
                                                <p id="sec" class="big-text">0</p>
                                                <span>Sec</span>
                                            </div>
                                        </div>
                                    </div>
                                </div></div>
                            <!--counter-->
                        </div>
                        <!--DIV 3-->
                        <div class="col-12">
                            <div class="p-3 border div3">
                                <p class="lead">
                                    Exam Started Time
                                </p><br><br>
                                <p class="lead">
                                    Exam Ending Time
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <!--DIV 2-->
                <div class="col-6">
                    <div class="p-3 border div2">
                        <p class="lead">
                            Attending Students List
                        </p>
                        <!--Student List-->
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Status</th>

                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark Wood</td>
                                    <td>Pending</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob Oram</td>
                                    <td>Completed</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob Oram</td>
                                    <td>Completed</td>
                                </tr>

                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob Oram</td>
                                    <td>Completed</td>
                                </tr>                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <br><br>
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
            <button class="btn btn-primary btnendexam" type="button">End Exam</button>
        </div>

        <script src="js/exam__detail.js"></script>
    </body>
</html>
