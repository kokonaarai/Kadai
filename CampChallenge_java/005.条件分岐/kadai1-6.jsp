<%-- 
    Document   : kadai1-6
    Created on : 2017/08/30, 14:32:34
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
      int i =2;
      
    switch(i){
        case 1:
            out.print("one");
            break;
        
        case 2:
            out.print("two");
            break;
            
        default:
            out.print("想定外");
            
            
            
    }
  
            %>
    </body>
</html>
