/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula05;


/**
 *
 * @author ester
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta (55555);
        p1.setDono ("Ester");
        p1.abrirConta("CC");
       
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta (77777);
        p2.setDono ("Creuza");
        p2.abrirConta("CP");
        
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(500); 
       
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
}

