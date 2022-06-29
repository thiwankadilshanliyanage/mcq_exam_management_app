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
