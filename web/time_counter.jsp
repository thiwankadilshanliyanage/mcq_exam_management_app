<%-- 
    Document   : time_counter
    Created on : Jun 28, 2022, 12:58:17 AM
    Author     : Thiwanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/time_counter.css"> 
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Countdown Timer</h1>
    <div id="container">
        <p id="hour-label" class="label">Hours</p><p id="min-label" class="label">Minutes</p><p id="sec-label" class="label">Seconds</p>
        <input id="hour" type="number" max="99" min="0" value="0" class="time"><p id="p1" class="semicolon">:</p><input id="minute" type="number" max="60" min="0" value="0" class="time"><p id="p2" class="semicolon">:</p><input id="sec" type="number" max="60" min="0" value="0" class="time">
        <button id="start" class="btn">Start</button>
        <button id="reset" class="btn">Reset</button>
    </div>
        <script src="js/time_counter.js"></script>
    </body>
</html>
