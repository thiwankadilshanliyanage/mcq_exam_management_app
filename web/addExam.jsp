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
            <form class="d-grid gap-2 d-md-flex justify-content-md-end col-3 search" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            <button type="button" class="qbtn btn btn-primary btn-lg">New Exam</button>
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
                        <td data-title="Exam">1st semester</td>
                        <td data-title="Last Updated">22nd June in 2022</td>
                        <td data-title="Status">Published</td>

                    </tr>
                    <tr>
                        <td data-title="Exam">1st semester</td>
                        <td data-title="Last Updated">22nd June in 2022</td>
                        <td data-title="Status">Published</td>

                    </tr>
                    <tr>
                        <td data-title="Exam">1st semester</td>
                        <td data-title="Last Updated">22nd June in 2022</td>
                        <td data-title="Status">Published</td>

                    </tr>
                    <tr>
                        <td data-title="Exam">1st semester</td>
                        <td data-title="Last Updated">22nd June in 2022</td>
                        <td data-title="Status">Published</td>

                    </tr>
                    <tr>
                        <td data-title="Exam">1st semester</td>
                        <td data-title="Last Updated">22nd June in 2022</td>
                        <td data-title="Status">Published</td>

                    </tr>
                    <tr>
                        <td data-title="Exam">1st semester</td>
                        <td data-title="Last Updated">22nd June in 2022</td>
                        <td data-title="Status">Published</td>

                    </tr>
                </tbody>
            </table>
        </div>
    </section>
</body>
</html>
