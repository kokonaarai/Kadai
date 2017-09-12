/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

class Human{    
    //パブリックな2つの変数
    public String name;
    public int age;    
    //2つの変数に値を設定するパブリックなメソッド
    public void setHuman(String n, int a){
        this.name = n;
        this.age = a;
    }    
    //2つの変数の中身をプリントするパブリックなメソッド
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }    
}


/**
 *
 * @author kokonaarai
 */


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

