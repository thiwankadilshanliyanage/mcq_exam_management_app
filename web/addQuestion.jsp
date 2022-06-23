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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

        <link type="text/css" rel="stylesheet" href="css/addQ.css">

        <title>Add Questions</title>
    </head>
    <body>
        <section class="w-50 p-3 sec">
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
        </section>
        <div class="w-50 p-3 addquestiondiv">
            <form>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>

    </body>
</html>
