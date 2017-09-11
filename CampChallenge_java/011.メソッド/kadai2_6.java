/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kokonaarai
 */
public class kadai2_6 extends HttpServlet {

    
     public String[] Profile(String x) {
         
        String[] KojinData1 = {"3456","ARAI","1993/0729","Tokyo"};
        String[] KojinData2 = {"5678","YAMADA","1993/01/01","Osaka"};
        String[] KojinData3 = {"1234","TANAKA","1993/12/35","Okinawa"};

//         ArrayList<String> KojinData1 = new ArrayList<String>();
//
//        for (int i = 0; i < 4; i++) {
//            KojinData1.add("");
//        }
//        KojinData1.set(0, "3456");
//        KojinData1.set(1, "ARAI");
//        KojinData1.set(2, "1993/07/29");
//        KojinData1.set(3, "Tokyo");
        
        
        
//         ArrayList<String> KojinData2 = new ArrayList<String>();
//
//        for (int i = 0; i < 4; i++) {
//            KojinData2.add("");
//        }
//        KojinData2.set(0, "1234");
//        KojinData2.set(1, "YAMADA");
//        KojinData2.set(2, "1993/01/01");
//        KojinData2.set(3, "Osaka");
//        
//        
//        ArrayList<String> KojinData3 = new ArrayList<String>();
//
//        for (int i = 0; i < 4; i++) {
//            KojinData3.add("");
//        }
//        KojinData3.set(0, "5678");
//        KojinData3.set(1, "TANAKA");
//        KojinData3.set(2, "1993/12/25");
//        KojinData3.set(3, "Okinawa");
//        
        
        if(x.equals(KojinData1[0])){
            return (KojinData1);
        }else if(x.equals(KojinData2[0])){
            return (KojinData2);
        }else if(x.equals(KojinData3[0])){
            return (KojinData3);
        }
              
                
         
         return null;
     
        
        
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
          
          
          String[] Data=Profile("3456");
///          out.print(Data[0]);
//          ArrayList <String>Data =new ArrayList<String>(); 
          
//            
        for (int i=0;i<Data.length; i++){
            
            out.print(Data[i]+"<br>");
            
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
    }// </editor-fold>

}
