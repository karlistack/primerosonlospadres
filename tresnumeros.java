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

public class tresnumeros {
    public static void main(String[] args) {


        System.out.print("Introduzca el  primer número,: ");
        Scanner illo = new Scanner(System.in);
        int n1 = illo.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int n2 = illo.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int n3 = illo.nextInt();

        int numero1 = n1;  //creamos las variables para quitarnos de en medio la repeticion de los numeros
        int numero2 = n2;
        int numero3 = n3;

        if (n1 == n2) { //nos quitamos de en medio sin vale lo mismo
            if (n1 == n3) {
                System.out.println("el numero es el mismo y es "+ n1);
                System.exit(0); // salimos
            }
        } else { //nos quitamos en medio si los numeros se repiten
            if (n1 != n2) {
                System.out.println(" n1 y n2 son diferentes");
            } else {
                System.out.println("son iguales");
            }
            if (n2 != n3) {
                numero2 = n2;
                numero3 = n3;
                System.out.println(" n2 y n3 son diferentes");
            } else {
                System.out.println(" son iguales");
            }
            if (n1 != n3) {
                numero1 = n1;
                numero3 = n3;
                System.out.println(" n1 y n2 son diferentes");
            } else {
                System.out.println(" son iguales ");
            }
            //corto el flujo del número repetido
        }
//comprobamos cual es el mayor, que esto en verad seria una funcion, public int esmayor();
        if (numero1 > numero2) {

            if (numero1 > numero3) {
                System.out.println(" El mayor es: " + numero1);
            } else {
                System.out.println("el mayor es: " + numero3);
            }

        } else if (numero2 > numero3) {

            System.out.println("el mayor es: " + numero2);
        } else {
            System.out.println("el mayor es: " + numero3);

        }

        //comprobamos cual es el menor, que esto en verad seria una funcion a lo public int esmenor()

        if (numero1 < numero2) {

            if (numero1 < numero3) {
                System.out.println("El menor es: " + numero1);
            } else {
                System.out.println("el menor es: " + numero3);
            }

        } else if (numero2 < numero3) {

            System.out.println("el menor es: " + numero2);
        } else {
            System.out.println("el menor es: " + numero3);

        }
        System.out.println("Fin");
    }
}
