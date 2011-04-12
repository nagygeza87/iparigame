<%-- 
    Document   : userpage
    Created on : 2011.04.11., 12:16:55
    Author     : Geza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello <s:property value="username" /> </title>
    </head>
    <body>
        <h1>Hello <s:property value="username" />!</h1>
        <h2>This is your house.</h2>
        <h2>Here are the things that are in your house.</h2>
    </body>
</html>
