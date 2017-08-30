<%-- 
    Document   : kadai1-5
    Created on : 2017/08/30, 14:07:18
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
            int num=3;
                    
              if(num==1){
                  out.print("1です！");
              }else if(num==2){
                  out.print("プログラミングキャンプ！");
              }else{
                   out.print("その他です！");
                      }
              %>
    </body>
</html>
