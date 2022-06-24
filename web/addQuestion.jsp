<%-- 
    Document   : addQuestion
    Created on : Jun 23, 2022, 7:59:26 PM
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
        <link type="text/css" rel="stylesheet" href="css/addQ.css">

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
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                            <tr>
                                <td data-title="Exam">What is your name?</td>
                                <td data-title="Last Updated">Answer 1, Answer 2, Answer 3, Answer 4</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <form>
                    <div class="row form-group">
                        <label for="date" class="col-sm-2 col-form-label">Exam Date</label>
                        <div class="col-sm-4">
                            <div class="input-group date" id="datepicker">
                                <input type="text" class="form-control">
                                <span class="input-group-append">
                                    <span class="input-group-text bg-white d-block">
                                        <i class="fa fa-calendar"></i>
                                    </span>
                                </span>
                            </div>
                        </div>
                    </div><br>
                    <div class="row form-group">
                        <label for="date" class="col-sm-2 col-form-label">Exam Duration</label>
                        <div class="col-sm-4">
                            <div class="input-group date" id="duration">
                                <input type="number" class="form-control" placeholder="Minutes">
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="-grid gap-2 d-md-flex justify-content-md-end">
                    <button type="button" class="btn btn-success">Publish Paper</button>
                </div>   
                </form>
            </section>

        </div>
        <div class="w-50 p-3 addquestiondiv">
            <form>
                <div class="row g-2">
                    <div class="col-md">
                        <input type="number" class="form-control " id="floatingInputGrid" placeholder="Number">
                    </div>
                    <div class="col-md col-xs-2">
                        <input type="text" class="form-control" id="floatingInputGrid" placeholder="Question">
                    </div>
                </div>
                <br>
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <label for="inputPassword6" class="col-form-label">1.</label>
                    </div>
                    <div class="col-auto width">
                        <input type="password" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline" placeholder="Answer 1">
                    </div>
                    <div class="col-auto">
                        <span id="passwordHelpInline" class="form-text">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        </span>
                    </div>
                </div><br>
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <label for="inputPassword6" class="col-form-label">2.</label>
                    </div>
                    <div class="col-auto width">
                        <input type="password" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline" placeholder="Answer 2">
                    </div>
                    <div class="col-auto">
                        <span id="passwordHelpInline" class="form-text">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        </span>
                    </div>
                </div><br>
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <label for="inputPassword6" class="col-form-label">3.</label>
                    </div>
                    <div class="col-auto width">
                        <input type="password" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline" placeholder="Answer 3">
                    </div>
                    <div class="col-auto">
                        <span id="passwordHelpInline" class="form-text">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        </span>
                    </div>
                </div><br>
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <label for="inputPassword6" class="col-form-label">4.</label>
                    </div>
                    <div class="col-auto width">
                        <input type="password" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline" placeholder="Answer 4">
                    </div>
                    <div class="col-auto">
                        <span id="passwordHelpInline" class="form-text">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                        </span>
                    </div>
                </div><br>
                <div class="col-md-12 text-center">
                    <button type="button" class="btn btn-primary">Submit</button>
                </div>               
            </form>
        </div>

        <script type="text/javascript">
            $(function () {
                $('#datepicker').datepicker();
            });
        </script>

    </body>
</html>
