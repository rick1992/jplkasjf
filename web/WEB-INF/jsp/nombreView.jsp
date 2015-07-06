<%-- 
    Document   : nombreView
    Created on : 31-may-2015, 17:37:49
    Author     : RICARDO
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Escribe tu NOMBRE</title>
    </head>
    <body>
        <h1>Escribe tu nombre maldito:</h1>
        <spring:nestedPath path="nombre" >
            <form action="" method="post">
                Nombre : <spring:bind path="valor">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
