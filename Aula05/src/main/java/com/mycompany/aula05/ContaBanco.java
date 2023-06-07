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
   
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
        
    
    public ContaBanco(){ // o método construtor
       this.saldo = 0;
       this.status = false;
   }

    public void setNumConta(int n){
       this.numConta = n;
   }
    
    public int getNumConta(){
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
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus (true);
        if ("CC".equals(t)){
            this.setSaldo (50);
        } else if ("CP".equals(t)) {
            this.setSaldo (150);  
        }
    }

    public void fecharConta(){
        if (this.getSaldo () > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
                System.out.println("Conta em débito");
        } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso");
            }
    }
    
    public void depositar(float v){
        if (this.getStatus ()){
            // ou this.saldo = this.saldo + v (fazendo pelos atributos)
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("É impossível depositar");
        }
    }

    public void sacar (float v){
        if (this.getStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo (this.getSaldo()- v);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else{ 
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v= 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        } else
            if ("CP".equals(this.getTipo())){
                v = 20;
            }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga");
        } else {
                System.out.println("Impossível pagar uma conta fechada");
        }
    }
}
