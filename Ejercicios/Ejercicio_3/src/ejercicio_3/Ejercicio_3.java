/*
Guillermo tiene N Dolares
Luis tiene la mitad de lo que posee Guillermo
Juan tiene la mitad de lo que posee luis y Guillermo juntos.

Hacer un programa que calcule el e imprima la cantidad total que tienen entre los 3
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float guillermo, luis, juan, total;
        
        System.out.println("Cuantos dolares tiene guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        
        total = guillermo + luis + juan;
        
        System.out.println("El total entre los 3 es: "+total);
    }
    
}
