

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="/projetPoolGeographie/css/newcss.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <nav>
            <c:url value="ControllerMain?section=menu-main" var="url01" />
            <c:import url="${url01}" />
        </nav>
        <h1>Hello Toi !</h1>
    </body>
</html>
