/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author ester
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
    /*public ContaBanco(float s, boolean f){ //este é o método construtor
       this.saldo = 0;
       this.status = false;
   }

    
    */
    public void setNumConta(int n){
       this.numConta = n;
   }
    
    public int getModelo(){
        return this.numConta; 
    }
    
    public void setTipo(String t){
       this.tipo = t;
   }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean s){
        this.status= s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public abrirConta(String t){
        tipo= t;
        status = true);
        if (this.tipo == "CC"){
            saldo= 50;
        } else
            if (this.tipo == "CP") {
                    saldo = 150;  
        }
    }

    public fecharConta(){
        if (this.saldo > 0){
            System.out.println("Conta com dinheiro");
        } else 
            if (this.saldo <0){
                System.out.println("Conta em débito");
        } else {
                status=false;
            }
    }
    
    public depositar(float v){
        if (status == true){
            saldo= saldo + v;
        } else {
            System.out.println("É impossível depositar");
        }
    }

    public sacar(float v);{
        if (status == true){
            if (saldo > v){
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else{ 
            System.out.println("Impossível sacar");
        }
    }

    public pagarMensal(){
        float v;
        if (this.tipo == "CC"){
            v = 12;
        } else
            if (this.tipo == "CP"){
                v = 20;
            }
        if (this.status == true){
            if (this.saldo > v){
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Impossível pagar");
        }
    }
    
}
