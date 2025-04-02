/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Ahmad
 */
public class employee {
   public String name;
     private String empId;
     private int pay;
     private boolean isBig;
     public employee(){
         name = null;
         empId = null;
         pay = 0;
         isBig = true;
     }
     public employee(String nm, String id, int py, boolean tr ){
         this.name= nm;
         this.empId= id;
         this.pay=py;
         this.isBig= tr;
         
     }
     public String getName(){
         return name;
     }
     public String getId(){
         return empId;
     }
     public int getPay(){
         return pay;
     }
     
     public boolean getTr(){
         return isBig;
     }
     
     
}
   


