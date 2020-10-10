/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alturas;

import java.util.Scanner;

/**
 *
 * @author md
 */
public class norbertorpg {

    public static void main(String[] args) {
        double altura;
        Scanner illo = new Scanner(System.in);

        System.out.println("hola, dime tu altura y te diremos a donde perteneces,usa , para indicar la altura");
        altura = illo.nextDouble();

        if(altura>=2.5){
            System.out.println("error");
            System.exit(0);
        }
        if(altura<=0.5){
            System.out.println("error");
            System.exit(0);
        }
        
        
        
        if (altura > 1.80) {
            System.out.println(" hola norto");
        } else {
            if (altura <= 1.80) {
                if (altura <= 1.60) {
                         if (altura <= 1.50) {

                        System.out.println("eres bajo ");
                    }

                } else {
                    System.out.println("eres medio");

                }

            } else {
                System.out.println("eres muy alto");

            }
        }

    }

}
