/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp;

/**
 *
 * @author kokonaarai
 */
      class Human2 extends Human{
          //2つの変数の中身をクリアするパブリックなメソッド
          public void clear(){
          this.name = "";
          this.age = 0;
        }

    }
 
     public class kadai3_2{

     public static void main(String[] args){
         //Human2クラスのインスタンス生成
         Human2 hito2 = new Human2();
         hito2.setHuman("ここな", 24);
         hito2.print();
         hito2.clear();
         hito2.print();
     }
 }
