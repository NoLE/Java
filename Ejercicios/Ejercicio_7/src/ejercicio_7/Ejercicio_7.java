/*
Construir un programa que dado el numero total de horas, devuelva la cantidad de semanas, dias y horas equivalentes
por ejemplo: dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas 
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int semanas, dias, horas, thoras;
        System.out.print("Ingrese cantidad de horas totales: ");
        thoras = entrada.nextInt();
        semanas = thoras / 168;
        dias = thoras%168 / 24;
        horas = thoras%24;
        System.out.println("Semanas: "+semanas+", dias: "+dias+", horas: "+horas);
//         System.out.println("horas: "+horas);
    }
    
}
