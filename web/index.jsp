<%-- 
    Document   : index
    Created on : Jul 3, 2017, 4:09:10 PM
    Author     : julie
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <s:head/>
    </head>
    <body>
        <h1>Insert new account</h1>
        <s:form action="registeraccount" method="post">
            <s:textfield name="username" label="Username"/>
            <s:password name="password" label="Password"/>
            <s:password name="confirm" label="Confirm"/>
            <s:textfield name="emailId" label="Email ID"/>
            <s:textfield name="phoneNo" label="Phone Number"/>
            <s:submit label="Insert"/>
        </s:form>
    </body>
</html>
