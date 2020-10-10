/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programaarea;

import java.util.Scanner;

/**
 *
 * @author md
 */
public class ahiqueva {

    public static void main(String[] args) {
        int area;
        int perimetro;
        int base;
        int altura;
        Scanner illo = new Scanner(System.in);
      
        
        System.out.println("Bienvenido al programa para calcular el area y perimetro de un cuadrado");
        System.out.println("intrduzca la base");
        base = illo.nextInt();
        if (base < 0) {
            System.out.println("la base no puede ser negativa");
            System.exit(0);
        }
        System.out.println("introduca la altura");
        altura = illo.nextInt();
        if (altura < 0) {
            System.out.println("la altura no puede ser negativa");
            System.exit(0);
        } else {

            area = base * altura;
            perimetro = (2 * base) + (2 * altura);
            System.out.println("la area: " + area);
            System.out.println("la base: " + perimetro);

            System.out.println("fin");
        }

    }
}
