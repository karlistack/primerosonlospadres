package imc;

import java.util.Scanner;

/**
 *
 * @author md
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner illo = new Scanner(System.in);
        String nombre;
        double peso = 0;
        double altura = 0;
        double imc;
        double aux;

        System.out.println("introduzca su nombre");
        nombre = illo.nextLine();

        System.out.println("introduzca su altura");
        aux = illo.nextDouble();
        if ((aux % 10) < 0.4) {

            altura = aux / 100;

        } else {

            if ((aux % 100) < 4) {
                altura = aux;

            }
        }

        System.out.println("introduzca su peso");
        aux = illo.nextDouble();
        if ((aux % 10) < 20) {

            peso = aux;

        } else {

            if ((aux % 100) > 200) {
                peso = aux / 1000;

            }
        }

        imc = peso/(altura*altura);
        
        
        
        
        
        
        System.out.println("Buenas"+nombre +"su imc es el siguiente tiene una altura de+"+altura+"metros, su peso es "+peso+"kilos, y por lo tanto su imc es "+imc);
        
        if(imc<40){
            if(mc<30)
        }else{
            System.out.println("sobre peso");
        
        }
        
        
        
    }

}
