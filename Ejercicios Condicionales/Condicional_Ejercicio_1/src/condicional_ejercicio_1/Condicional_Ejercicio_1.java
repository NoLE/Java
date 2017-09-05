/*
Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
 */
package condicional_ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicional_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero: ")
        );
        if (numero%10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10");
            
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es multiplo de 10");
        }
    }
    
}
