/*
Leer por teclado 2 tablas de 10 numeros enteros y mezclarlas en una tercera de forma:
1°A, 1°B, 2°A, 2°B, etc...
 */
package arreglos_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Arreglos_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];
//        Pedimos el arreglo A
        System.out.println("Digite el Primero Arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            a[i] = entrada.nextInt();
        }
        System.out.println("\nDigite el Segundo Arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            b[i] = entrada.nextInt();
        }
//        Ahora vamos a mezclar los 2 arreglos en el arreglo c
//        vamos a utlizar el iterador i para los arreglos a y b
//        y el iterador j para el arreglo c
        
        int j= 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("El tercer arreglo es: ");
        for (int i : c) {
            System.out.print(i);
        }
    }
    
}
