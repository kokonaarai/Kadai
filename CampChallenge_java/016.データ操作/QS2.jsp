<%-- 
    Document   : QS1
    Created on : 2017/09/21, 13:08:14
    Author     : kokonaarai
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
               <%
    //変数宣言
    int[] prime = {2,3,5,7};
    int bef = Integer.parseInt(request.getParameter("no"));
    int no = bef;
    ArrayList<Integer> primefacter = new ArrayList<Integer>();
%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

 <%
                for(int i = 0;i < 4; i++){
                    while(no % prime[i] == 0){
                        primefacter.add(prime[i]);
                        no /= prime[i];
                    }
                }
            
            out.print("元の数値："+bef);
            out.print("素因数分解の結果："+primefacter);
            if(no != 1){out.print("余った値："+no);}
        %>
    </body>
</html>
