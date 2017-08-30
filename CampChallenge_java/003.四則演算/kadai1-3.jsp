<%-- 
    Document   : kadai1-3
    Created on : 2017/08/30, 13:20:44
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
        <%
       final int BASE= 50;
       int num = 5;
       
        int tasu= BASE + num;
        int hiku= BASE - num;
        int kake= BASE * num;
        int wari= BASE / num;
        int amari= BASE %num;
        
        out.println("50+5="+tasu);
        out.println("50-5="+hiku);
        out.println("50×5="+kake);
        out.println("50÷5="+wari);
        out.println("50%5="+amari);
           %>
    </body>
</html>
