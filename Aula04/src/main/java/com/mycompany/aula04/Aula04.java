/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula04;


/**
 *
 * @author ester
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //c1.setModelo("Bic");
        c1.modelo = "Bic";
        
        //c1.ponta = 0.5;
        c1.setPonta (0.5f);
        
        c1.status();
    }
}
