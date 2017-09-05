/*
Leer 10 numeros enteros, guardarlos en un arreglo, debemos mostrarlo en el siguiente orden
El primero
El ultimo
El segundo
El Penultimo
El tercero
etc..
 */
package arreglos_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Arreglos_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int sube = 0;
        int baja = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite numero "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[sube]);
            sube++;
            System.out.println(numeros.length-baja);
            i++;
            baja++;
        }
    }
    
}
