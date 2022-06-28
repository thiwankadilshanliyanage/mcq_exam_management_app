<%-- 
    Document   : student_question_paper
    Created on : Jun 28, 2022, 11:42:31 AM
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
        <link rel="stylesheet" href="css/student_question_paper.css" type="text/css">
        <title>Questions</title>
    </head>
    <body>
        <div class="d-inline exnamediv ">
            <button type="button" class="btn btn-labeled btn-default">
                <i class="fa fa-chevron-left"></i></button>
            <span class="btn-label exname">Exam Name</span><br><br></div> 


        <div class="wrapper container counterdiv ">
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
        </div>
    </div>
    <div class="container d-flex align-items-center justify-content-center parent">
        <p class="q">a) What is question A?</p>
        <div class="w-50 p-3 mb-4 border justify-content-center div">
            <div class="answerlist">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                    <label class="form-check-label text" for="flexRadioDefault1">
                         Answer 1
                    </label><br><br>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                    <label class="form-check-label text" for="flexRadioDefault2">
                        Answer 2
                    </label><br><br>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                    <label class="form-check-label text" for="flexRadioDefault2">
                        Answer 3
                    </label><br><br>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                    <label class="form-check-label text" for="flexRadioDefault2">
                        Answer 4
                    </label>
                </div>
            </div>
            <div class="container px-4 btnlist">
                <div class="row gx-5">
                    <div class="col">
                        <button type="button" class="btn btn-secondary btn-lg btnwidht">Previous</button>
                    </div>
                    <div class="col">
                        <p class="h4 qno">Question No</p>
                    </div>
                    <div class="col">
                        <button type="button" class="btn btn-secondary btn-lg btnwidht">Next</button>
                    </div>
                </div>
            </div>
        </div>
        <button type="button" class="btn btn-outline-success btnsuc">Save</button>
        <button type="button" class="btn btn-outline-primary btncom">Complete</button>
    </div>
    <script src="js/student_question_paper.js"></script>
</body>
</html>
