<%-- 
    Document   : kadai1-9
    Created on : 2017/08/30, 15:47:33
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
            
           String[] moji={"10","100","soeda","hayashi","-20","118","END"};
           moji[2]="33";
           
           out.print(moji[2]);
           
            %>
    </body>
</html>
