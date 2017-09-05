/*
Leer los datos correspondiente a dos tablas de 12 elementos numericos, mezclarlos en una tercera tabla de la siguiente
forma: 3 de la tabla A, 3 de la tabla B, otros 3 de la tabla A, otros 3 de la tabla B, etc...
 */
package arreglos_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Arreglos_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        a = new int[12];
        b = new int[12];
        c = new int[24];
        
        System.out.println("Digite el Arreglo A: ");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+"Ingrese un  numero: ");
            a[i] = entrada.nextInt();
        }
        System.out.println("Digite el Arreglo B: ");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+"Ingrese un  numero: ");
            b[i] = entrada.nextInt();
        }
        int j = 0;
        int aumentoA = 0;
        int aumentoB = 0;
        for (int i = 0; i < 24; i++) {
               
            
        }
    } 
    
}
