/*
 Hacer un programa que calcule el cuadrado de una suma
(a+b)elevado a 2 = a elevado a 2 + b elevado a 2 + 2ab
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a, b, suma, resultado;
        
        System.out.print("Ingrese valor de a y b: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        suma = a + b;
        //resultado = (a*a) + (b*b) + (2*a*b);
        resultado = (int) Math.pow(suma, 2);
        
        System.out.println("El resultado es: "+resultado);
    }
    
}
