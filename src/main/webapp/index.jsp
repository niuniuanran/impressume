<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> imp: Resume to Impress </title>
    <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700" rel="stylesheet">
    <link href='<c:url value="/imp-css/custom-styling.css"/>' rel="stylesheet" type="text/css">
    <link href='<c:url value="/imp-css/make-cv.css"/>' rel="stylesheet">
    <script src='<c:url value="/js/style.js"/>'></script>
    <script src="index.js"></script>
    <script src='<c:url value="/js/image-management.js"/>'></script>
</head>
<body>
<%--  <div id="tests">--%>
<%--  <p><a href='<c:url value="/test-to-json"/>' >Test to json</a></p>--%>
<%--   <p><a href='<c:url value="/test-responsive"/>' >Test Responsive</a></p><p>--%>
<%--    <a href='<c:url value="/test-json-to-responsive"/>' >Test json to responsive</a></p>--%>
<div id="homepage-container" class="rel-position">

    <div id="homepage-body" class="rel-position homepage-content">
        <div class="abs-position light-bg theme-bg-transition" id="top-left-rect">
            <h1 class="homepage-title" id="title-imp">imp</h1>
        </div>

        <div class="abs-position light-bg" id="main-rect">
            <div class="abs-position light-bg white-bg-transition" id="center-little-rect">
                <h1 class="homepage-title" id="title-resume">Resume</h1>
            </div>

            <div id="functions" class="abs-position">

                <div class="function-box light-bg white-bg-transition" id="welcome-box">
                    <form action='<c:url value="/make_cv"/>' method="get" enctype="multipart/form-data">

                        <div class="function" id="pick-theme-color">
                            <div id="welcome1">
                                <p><strong>Welcome!</strong></p>
                                <p>We will be making your <strong>responsive CV</strong> together. </p>
                            </div>
                            <div id="welcome2">
                                <p> (Click <a href='<c:url value="/anran_niu"/>' target="_blank">here</a> for a basic
                                    example of what your CV will look like) </p>
                            </div>

                            <div id="welcome3">
                                <label for="colorPicker"> To start, pick a theme color by clicking the box
                                    below: </label>
                                <br>
                                <input type="color" value="#8F96AE" id="colorPicker" name="themeColor">
                                <hr>
                                <label for="confirmColor"> Do you feel pleased with your color <br>(and your eyes are
                                    comfortable reading in it)? </label><br>
                                <button id="confirmColor" class="next-step-button">Yes happy with the color!</button>
                            </div>
                        </div>

                        <div class="function non-display" id="about-you">
                            <div id="guide1">
                                <p>Now let's talk about you</p>
                            </div>
                            <label for="first-name">Your first name is: </label>
                            <input type="text" id="first-name" name="firstName" required>
                            <br>
                            <label for="last-name"> Your last name is: </label>
                            <input type="text" id="last-name" name="lastName" required><br>
                            <%--                            <label>Upload your profile photo here:</label><br>--%>
                            <%--                            <input type="file" id="profile-photo-upload" name="profile-photo" accept="image/png, image/jpeg" onchange="uploadPhoto(this, '/make_cv')"/>--%>
                            <%--                            <p class="not-important-note"> I would recommend having a photo for your responsive CV, but don't worry if you--%>
                            <%--                                don't - we'll figure out something else. </p>--%>

                            <label for="address"> You are from: </label><input type="text" id="address" name="city" placeholder="city">, <input type="text" id="address" name="country" placeholder="country"><br>
                            <input type="submit" value="Continue!" class="next-step-button">
                    </form>
                </div>
            </div>

        </div>


    </div>

    <div id="temp-container" class="temp">
        <p class="temp-info">
            Whoops you found my homepage under construction!
        </p>
        <p class="temp-info">
            This is my personal project of interest, and the goal is to make a place where you fill some
            guided, simple forms and make your own responsive CV.
        </p>
        <p class="temp-info">
            At this stage I just basically finished the product part (you might have seen some CV's I made for my
            friends).
        </p>
        <p class="temp-info">
            Please feel free to contact me if you have any suggestions on what this page and the CV
            products should be like!
        </p>
        <p class="temp-info">
            My email address is : <a href="mailto: aniu423@aucklanduni.ac.nz"
                                     target="_blank">aniu423@aucklanduni.ac.nz</a>
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

</div>

</body>
</html>