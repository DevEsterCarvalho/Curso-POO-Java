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
   private String cor;
   private boolean tampada;
   
   public Caneta(){ //este é o método construtor
       this.tampar();
       this.cor = "Azul";
   }
   
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
   
   public void tampar (){
       this.tampada = true;
   }
   
   public void destampar (){
       this.tampada = false;
   }
   
   public void status(){
       System.out.println("Sobre a caneta:");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.cor);
       System.out.println("Tampada: " + this.tampada);
    }
   }
