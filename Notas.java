/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregar;

/**
 *
 * @author md
 */
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        double nota;
        Scanner illo = new Scanner(System.in);

        System.out.println("Introduzca la notas");
        nota = illo.nextDouble();
        if (nota > 9) {
            System.out.println("sobresaliente ");
        } else {
            if (nota <= 8) {
                if (nota <= 5.5) {
                    if (nota <= 4.99) {

                        System.out.println("suspenso ");
                    }

                } else {
                    System.out.println("aprobado");

                }

            } else {
                System.out.println("notable");

            }
        }

    }

}
