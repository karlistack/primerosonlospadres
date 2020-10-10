
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * una calculdora :
 *
 * @author md
 */
public class calculadora {

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("suma: " + suma);
        return suma;
    }

    public static int resta(int num1, int num2) {
        int resta = num1 - num2;
        System.out.println("resta " + resta);
        return resta;
    }

    public static int multplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        System.out.println("multiplicacion: " + multiplicacion);
        return multiplicacion;
    }

    public static int division(int num1, int num2) {
        if (num2 <= 0) {
            System.out.println("no se puede dividir por cero por el bien de mi ordenador");
            System.out.println("salimos del programa.");
            System.exit(0);
        }
        int divison = num1 / num2;
        System.out.println("division" + divison);
        return divison;
    }

    public static void main(String[] args) {
        int n1;
        int n2;
        int operacion;
        Scanner illo = new Scanner(System.in);
        System.out.println("bienvenido a la calculadora, introduzca los numeros");
        System.out.println("primer numero");
        n1 = illo.nextInt();
        System.out.println("segundo");
        n2 = illo.nextInt();
        /* System.out.println("procedemos a las operaciones");
        suma(n1, n2);
        resta(n1, n2);
        multplicacion(n1, n2);
        division(n1, n2);*/
        System.out.println(" introduzco la opcion que quieres");
        System.out.println(
                " para  sumar -> 1: \n" + 
                "       restar-> 2: \n" + 
                "       multiplicar -> 3 \n"+ 
                "       dividir  -> 4 \n");
        operacion = illo.nextInt();
        switch (operacion) {
            case 1:
                suma(n1, n2);

                break;
            case 2:
                resta(n1, n2);

                break;
            case 3:
                multplicacion(n1, n2);

                break;
            case 4:
                division(n1, n2);

                break;

        }

    }

}
