<%-- 
    Document   : kadai1-10
    Created on : 2017/08/30, 16:12:40
    Author     : kokonaarai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.util.HashMap" %>
        <%
        HashMap<String,String>kadai=new HashMap<String,String>();
            
            kadai.put("1","AAA");
            kadai.put("hello","world");
            kadai.put("soeda","33");
            kadai.put("20","20");
            
            out.print(kadai.get("hello"));
            %>
    </body>
</html>
