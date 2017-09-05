/*
La calificación final de un estudiante de Informática se calcula con base a las 
calificaciones de cuatro aspectos de su rendimiento académico: participación, 
primer examen parcial, segundo examen parcial y examen final. Sabiendo que las 
calificaciones anteriores entran a la calificación final con ponderaciones del 
10%, 25%, 25% y 40%,
Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
 */
package ejercicio_5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimales =  new DecimalFormat("0.0");
        float  participacion, pexamen, sexamen, examenf, cfinal;
        
        System.out.print("Ingrese nota por participaicion: ");
        participacion = entrada.nextFloat();
        System.out.print("Ingrese nota primer examen: ");
        pexamen = entrada.nextFloat();
        System.out.print("Ingrese nota segundo examen: ");
        sexamen = entrada.nextFloat();
        System.out.print("Ingrese nota final: ");
        examenf = entrada.nextFloat();
        
        participacion *= 0.10f;
        pexamen *= 0.25f;
        sexamen *= 0.25f;
        examenf *= 0.40f;
        
        cfinal = participacion + pexamen + sexamen + examenf;
        
        System.out.println("La nota final es: "+decimales.format(cfinal));
    }
    
}
