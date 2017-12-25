<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
    <spring:url var="css" value="/resources/css"/>
    <spring:url var="js" value="/resources/js"/>
    <spring:url var="images" value="/resources/images"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:set var="contextRoot" value="${pageContext.request.contextPath }"/>


<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Homepage - ${title}</title>
    
    <!-- code for active menu -->
    <script>
    window.menu= '${title}';
    </script>
   

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
    
    <!-- page content -->
    <!-- loading the home content -->
    <c:if test="${userClickHome==true}">
    <%@include file="home.jsp" %>
     </c:if> 
     <!-- it works only click about us  -->
      <c:if test="${userClickAbout==true}">
    <%@include file="about.jsp" %>
     </c:if> 
      <!-- it works only contact  -->
      <c:if test="${userClickContact==true}">
    <%@include file="contact.jsp" %>
     </c:if>

    <!-- Footer comes here -->
    <%@include file="./shared/footer.jsp" %>
   

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>
    <!-- self coded javascript -->
   <script src="${js}/myapp.js"></script>

  </body>

</html>