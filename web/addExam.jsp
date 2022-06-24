<%-- 
    Document   : addExam
    Created on : Jun 23, 2022, 11:23:33 PM
    Author     : Thiwanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <!--CSS file -->
        <link type="text/css" rel="stylesheet" href="css/exam.css">

        <title>Add Exam</title>
    </head>
    <body>    
        <section class="p-5">
            <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                <button type="button" class="qbtn btn btn-primary btn-lg">Add Questions</button>
            </div><br><br>
            <div class="table-responsive" id="no-more-tables">
                <table class="table bg-white">
                    <thead class="bg-dark text-light">
                        <tr>
                            <th>Exam</th>
                            <th>Last Updated</th>
                            <th>Status</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td data-title="Exam"></td>
                            <td data-title="Last Updated"></td>
                            <td data-title="Status"></td>

                        </tr>
                    </tbody>
                </table>
            </div>
        </section>
    </body>
</html>
