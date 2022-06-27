<%-- 
    Document   : counter
    Created on : Jun 27, 2022, 7:36:11 PM
    Author     : Thiwanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/counter.css">
        <title>JSP Page</title>

    </head>
    <body>
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
        </div>
        <script src="js/counter.js"></script>

    </body>
    
    </html>
