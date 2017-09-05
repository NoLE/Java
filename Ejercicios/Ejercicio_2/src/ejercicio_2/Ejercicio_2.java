/*
 Calcular el salario semanal, con los datos de valor hora y horas semanales
 */
package ejercicio_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatea = new DecimalFormat("###,###.##"); // para transformar 1000 a 1.000, agregar un punto a miles
        
        int hsemana, vhora, salario;
        System.out.println("Ingrese cantidad de horas semanales: ");
        hsemana = entrada.nextInt();
        System.out.println("Ingrese valor hora: ");
        vhora = entrada.nextInt();
        
        salario = vhora * hsemana;
        
        System.out.println("Tu salario semana es: "+formatea.format(salario)); //formatea.format transforma a decimalales o agrega un punto por los miles
        
    }
    
}
