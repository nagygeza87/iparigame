<%-- 
    Document   : index
    Created on : 2011.01.17., 15:25:40
    Author     : Geza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ipari Objektum gaming page</title>
    </head>
    <body>
        <h1>Hello There, this is the gaming page of Ipari-Objektum!</h1>

        <p>Please fill in your details to log in</p>

        <s:form name="loginform" action="LoginAction">
            <s:textfield name="username" label="Enter username here" labelposition="left" />
            <s:password name="password" label="Enter password here" labelposition="left" />
            <s:submit label="Log In" />
        </s:form>
    </body>
</html>
