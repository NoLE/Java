/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, div, mult, resto;
        System.out.print("Digite 2 Numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        div = numero1 / numero2;
        mult = numero1 * numero2;
        resto = numero1 % numero2; //% el porcentaje se denomina MOD, SACA EL RESUIDIO DE UNA DIVISION
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La division es: "+div);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("El resto es: "+resto);
        
        // x++ incrementa el valor x y le asigna 1 mas, ++x hace lo mismo pero asigna primero el aumento
        // x++ primero haria la asignacion y luego el aumento
        // ++x primero haria el aumento y luego la asignacion
    }
    
}
