
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author md
 */
public class armeelfavor {

    public static void main(String[] args) {
        double numero;
        Scanner illo = new Scanner(System.in);
        
        System.out.println("introduce el numero");
        numero = illo.nextDouble();
        if(numero<=0){
            if(numero>=0){
                if(numero==0){
                    System.out.println("es neutro");
                }
            }else{
                System.out.println("es negativo");
            }
        }else{
            System.out.println("es positivo");
        }
    }
}
