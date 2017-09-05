/*
Pedir 5 numeros. guardarlos en un arreglo y mostrarlo en el mismo orden introducido
 */
package arreglos_ejercicio_;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Arreglos_Ejercicio_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
            float numeros[] = new float[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite numero "+(i+1)+": ");
                numeros[i] = entrada.nextFloat();
        }
            for (int i = numeros.length-1; i >= 0; i--) {
                 System.out.println(numeros[i]);
        }
   }
        
    
}

