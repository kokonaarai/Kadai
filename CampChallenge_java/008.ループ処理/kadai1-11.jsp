<%-- 
    Document   : kadai1-11
    Created on : 2017/08/30, 16:46:23
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
           long answer=1;
            for(int i=0;i<20;i++){
                answer=answer*8;
                out.print(answer+"<br>");
            }
            
            %>
    </body>
</html>
