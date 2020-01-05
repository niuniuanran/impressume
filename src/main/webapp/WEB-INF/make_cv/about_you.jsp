<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: anran
  Date: 5/01/20
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>imp: about you</title>
    <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700" rel="stylesheet">
    <link href='<c:url value="/imp-css/custom-styling.css"/>' rel="stylesheet" type="text/css">
    <link href='<c:url value="/imp-css/make-cv.css"/>' rel="stylesheet">
    <script src='<c:url value="/js/style.js"/>'></script>
    <script>
        window.onload=function (){
            doCustomizedColor("${themeColor}");
        }
    </script>
</head>
<body>
<div class="white-bg theme-txt function-box" id="about-you-container">
<form id="basic-info-form" action='<c:url value="/make_cv"/>'>
    hello
</form>
</div>
</body>
</html>
