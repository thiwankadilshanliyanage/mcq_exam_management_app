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
                            <div class="p-3 border  div1">
                                <p class="lead">
                                    Exam Completed
                                </p><br><br>
                                <h1 class=" d-flex justify-content-center atend" >10/20</h1>
                            </div>
                        </div>
                        <div class="col-12">
                            <div class="p-3 border div3">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-6">
                    <div class="p-3 border div2"></div>
                </div>
            </div>
        </div>
    </body>
</html>
