<%-- 
    Document   : newjsp
    Created on : 2017/09/12, 15:24:28
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
           
             
            String kadai="";
             for(int i=0;i<30;i++){
                 kadai=kadai+"A";
                 out.print(kadai);
             }
             
             %>
    </body>
</html>
