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
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f); //criando parametros diferentes
        c1.status();
        Caneta c2 = new Caneta ("kkk", "Laranja", 1.5f);
        c2.status();
    }
}
