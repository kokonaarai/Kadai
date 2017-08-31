<%-- 
    Document   : kadai1-13
    Created on : 2017/08/31, 10:15:33
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
           int sum = 0;

          for (int i = 1; i <= 1000; i++){
                sum += i;
             }

            out.print("合計は" + sum + "です"); 


            %>
    </body>
</html>
