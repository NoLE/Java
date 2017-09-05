/*
Pedir 5 numeros. guardarlos en un arreglo y mostrarlo en el mismo orden introducido
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Arreglos_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String[] nombres = {"Maria","Aurora","Victor"};
//        for (String arg : nombres) {
//            System.out.println("Nombre: "+arg);
//        }
            Scanner entrada = new Scanner(System.in);
            float numeros[] = new float[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite numero "+(i+1)+": ");
                numeros[i] = entrada.nextFloat();
        }
            for (float i : numeros) {
                System.out.println(i);
            
        }
   }
        
    
}
