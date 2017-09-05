/*
construir un programa que calcule ecuacion de segundo grado
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, rsuma,rresta, raiz;
        System.out.print("ingrese valor de x, b y c: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        rsuma = (-b + (Math.sqrt( Math.pow(b, 2) - (4 * a * c)))) / (2 * a); // Mat.pow eleva un numero
        rresta = (-b - (Math.sqrt( (b * b) - (4 * a * c)))) / (2 * a);
        raiz = Math.sqrt( (b * b) - (4 * a * c));
        
        System.out.println("El resultado de la suma es: "+rsuma);
        System.out.println("El resultado de la suma es: "+rresta);
        System.out.println("La raiz es: "+Math.round(raiz));
        
    }
    
}
