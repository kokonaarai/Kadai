<%-- 
    Document   : kadai1-7
    Created on : 2017/08/30, 15:14:41
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
         char moji='あ';
         
        switch(moji){
            case 'A':
                out.print("英語");
                break;
             
            case 'あ':
                out.print("日本語");
                break;
        }


            %>
            
    </body>
</html>
