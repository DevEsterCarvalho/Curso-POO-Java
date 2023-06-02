/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author ester
 */
public class Caneta {
   private String modelo;
   private float ponta;
   
   public String getModelo(){
   return this.modelo; 
}
   public void setModelo(String m){
       this.modelo = m;
   }
   public float getPonta(){
       return this.ponta;
   }
   public void setPonta(float p){
       this.ponta = p;
   }
   public void status(){
       System.out.println("Sobre a caneta:");
       System.out.println("Modelo: " + this.getModelo);
       System.out.println("Ponta: " + this.getPonta);
        
    }
   }
