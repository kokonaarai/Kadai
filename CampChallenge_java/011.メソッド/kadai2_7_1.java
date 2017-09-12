/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kokonaarai
 */
public class kadai2_7_1 extends HttpServlet {

     public String[][]Profile() {
         
        String[][] KojinData = { {"3456","ARAI","1993/0729","Tokyo"},
                                   {"5678","YAMADA","1993/01/01","Osaka"},
                                   {"1234","TANAKA","1993/12/25","Okinawa"} };
          
        KojinData[2][3]=null;
 
        
        return (KojinData);
        
        
//        if(x.equals(KojinData1[0])){
//            return (KojinData1);
//        }else if(x.equals(KojinData2[0])){
//            return (KojinData2);
//        }else if(x.equals(KojinData3[0])){
//            return (KojinData3);
//        }
              
                
         
         
         
         
     }
        
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
          
          
///          out.print(Data[0]);
//          ArrayList <String>Data =new ArrayList<String>(); 
          
// 
        String [][] Data = Profile() ;
         
        for(String[] a : Data){
           for(String b : a){
               if(b==Data[0][0]  || b==Data[1][0]  || b==Data[2][0] || b==Data[2][3]){
                   continue;
               }
               out.print(b+"<br>");
        
        
//         for (int i=0; i<Data.length; i++){
//             for(int j =0; j<Data[i].length; i++){
////             
////             if(i==0){
////                continue;
////            } 
//                out.print((Data[i][j]));
                
           }

         }  
//            out.print(Data[i]+"<br>");
            
        
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
