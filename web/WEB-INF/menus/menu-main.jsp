<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul>
    <li>
        <c:url value="ControllerMain" var="url01" />
        <a href="${url01}">home |</a>
    </li>
    <li>
        <c:url value="ControllerMain?section=afficher-livres" var="url02" />
        <a href="${url02}">home |</a>
    </li>
</ul>