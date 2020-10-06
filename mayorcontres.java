/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mayorquetres;

import java.util.Scanner;

/**
 *
 * @author md
 */
public class mayorcontres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el  primer número,: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int n3 = sc.nextInt();

         int numero1 = n1;
        int numero2 = n2;
        int numero3 = n3;
        //nos quitamos de en medio sin vale lo mismo
        if (n1 == n2) {
            if (n1 == n3) {
                System.out.println("el numero es el mismo y es");
                System.exit(0);
            }
        } else {
            if (n1 != n2) {
                System.out.println("n1 y n2 son diferentes");
                System.out.println("son iguales");
            }
            if (n2 != n3) {
                numero2=n2;
                numero3=n3;
                System.out.println("n2 y n3 son diferentes");
            } else {
                System.out.println("son iguales");
            }
            if (n1 != n3) {
                numero1=n1;
                numero3=n3;
                System.out.println(" n1 n2 son diferentes");
            } else {
                System.out.println("son iguales");
            }

        }

        if (numero1 > numero2) {

            if (numero1 > numero3) {
                System.out.println("El mayor es: " + numero1);
            } else {
                System.out.println("el mayor es: " + numero3);
            }

        } else if (numero2 > numero3) {

            System.out.println("el mayor es: " + numero2);
        } else {
            System.out.println("el mayor es: " + numero3);

        }
    }
}
