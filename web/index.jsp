<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Impressume: Resume to Impress </title>
  </head>
  <body>
  <div id="tests">
  <p><a href='<c:url value="/test-to-json"/>' >Test to json</a></p>
   <p><a href='<c:url value="/test-responsive"/>' >Test Responsive</a></p><p>
    <a href='<c:url value="/test-json-to-responsive"/>' >Test json to responsive</a></p>


  </div>

  </body>
</html>