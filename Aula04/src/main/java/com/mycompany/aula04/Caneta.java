/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author ester
 */

// com ctrl + i (i= inserir código) inclui métodos 

public class Caneta {
   private String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;
   
   public Caneta(String m, String c, float p){ //este é o método construtor
       this.modelo = m;
       this.cor = c;
       this.ponta = p;
       this.tampar();
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
