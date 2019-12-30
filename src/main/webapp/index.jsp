<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> imp: Resume to Impress </title>
    <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700" rel="stylesheet">
    <link href="imp-styling/imp-styling.css" rel="stylesheet" type="text/css">
    <script>
        window.onload = function () {
            document.querySelectorAll(".theme-bg-transition").forEach(function (element) {
                element.classList.remove("light-bg");
                element.classList.add("theme-bg");
            });
            document.querySelectorAll(".white-bg-transition").forEach(function (element) {
                element.classList.remove("light-bg");
                element.classList.add("white-bg");
            });
            document.querySelectorAll(".theme-txt-transition").forEach(function (element) {
                element.classList.add("theme-txt");
            })
        }
    </script>
</head>
<body>
<%--  <div id="tests">--%>
<%--  <p><a href='<c:url value="/test-to-json"/>' >Test to json</a></p>--%>
<%--   <p><a href='<c:url value="/test-responsive"/>' >Test Responsive</a></p><p>--%>
<%--    <a href='<c:url value="/test-json-to-responsive"/>' >Test json to responsive</a></p>--%>
UPDATED
<div id="homepage-container">
    <div class="abs-position light-bg theme-bg-transition" id="top-left-rect">
        <h1 class="homepage-title" id="title-imp">imp</h1>
    </div>

    <div class="abs-position light-bg" id="main-rect">
        <div class="abs-position light-bg white-bg-transition" id="center-little-rect">
            <h1 class="homepage-title" id="title-resume">Resume</h1>
        </div>
        <div id="temp-container">
            <p class="temp-info">
                Whoops you found my homepage under construction!
            </p>
            <p class="temp-info">
                This is my personal project of interest, and the goal is to make a place where you fill some
                guided, simple forms and make your own responsive CV.
            </p>
            <p class="temp-info">
                At this stage I just basically finished the product part (you might have seen some CV's I made for my
                friends). Here's an <a href="./yatian_wang">example</a> resume for my friend Yatian.
            </p>
            <p class="temp-info">
                Please feel free to contact me if you have any suggestions on what this page and the CV
                products should be like!
            </p>
            <p class="temp-info">
                My email address is : <a href="mailto: aniu423@aucklanduni.ac.nz" target="_blank">aniu423@aucklanduni.ac.nz</a>
            </p>
            <p class="temp-info">
                My github address is : <a href="http://github.com/niuniuanran"
                                          target="_blank">github.com/niuniuanran</a>
            </p>
            <p class="temp-info">Cheers!</p>
            <p class="temp-info">Anran :)</p>
            <hr>
            <h3 class="temp-info"> Acknowledgement </h3>
            <p class="temp-info"> The Responsive CV is based on Black Rock Digital's startbootstrap-resume.
                Their github : <a href="https://github.com/BlackrockDigital/" target="_blank">https://github.com/BlackrockDigital/</a>
            </p>
        </div>
    </div>
    <h1 class="homepage-title light-txt theme-txt-transition" id="title-imp-bottom">imp</h1>
</div>


</body>
</html>