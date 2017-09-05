/*
Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media de los numeros
positivos y contar el numero 0
 */
package arreglos_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Arreglos_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float contar_ceros=0, conteopos=0, conteonega=0, sumapos=0, sumanega=0, mediapos, medianega;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite numero "+(i+1)+": ");
            numeros[i] = entrada.nextFloat();
            if (numeros[i] == 0) {
                contar_ceros++;
            }
            else if (numeros[i] > 0) {
                sumapos = numeros[i] + sumapos;
                conteopos++;
            } else {
                sumanega += numeros[i];
                conteonega++;
            }
        }
            if (conteopos == 0) {
                System.out.println("No hay numeros positivos");
        } else {
                mediapos = sumapos / conteopos;
                System.out.println("Media Positivos: "+mediapos);
        }
            if (conteonega == 0) {
                System.out.println("No hay numeros negativos");
        } else {
                medianega = sumanega / conteonega;
                System.out.println("Media Negativos: "+medianega);
        }
            System.out.println("La cantidad de 0 es: "+contar_ceros);
        }
    }
    
