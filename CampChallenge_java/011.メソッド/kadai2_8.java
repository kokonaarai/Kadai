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
public class kadai2_8 extends HttpServlet {

    public String[][]Profile() {
         
        String[] KojinData1 = {"3456","ARAI","1993/0729","Tokyo"};
        String[] KojinData2 = {"5678","YAMADA","1993/01/01","null"};
        String[] KojinData3 = {"1234","TANAKA","1993/12/25","Okinawa"};
          
        String[][] Kd = { KojinData1, KojinData2, KojinData3};
 
        
        return Kd ;
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
           String [][] Kd2 = Profile() ;
           Integer limit =2;
         
        for(int i=0; i<Kd2.length; i++){
            
            if(i==limit){
               break;
           }
        
           for(int j=1; j<Kd2[i].length; j++){
               if(Kd2[i][j] == null){
                   continue;
//               }else if(i==limit){
//                       break;
                   }
               out.print(Kd2[i][j]+"<br>");
           
        }
       }
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
    }
}
// </editor-fold>


