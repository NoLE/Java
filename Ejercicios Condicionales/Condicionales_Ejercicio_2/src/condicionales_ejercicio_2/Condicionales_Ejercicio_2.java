/*
Pedir dos numero y decir cual es el mayor o si son iguales
 */
package condicionales_ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2: "));
        
        if (num1==num2) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
             }
        else {
                if (num1>num2) {
                JOptionPane.showMessageDialog(null, "El numero: "+num1+" es mayor");

                 } else {
                JOptionPane.showMessageDialog(null, "El numero: "+num2+" es mayor");
           }
        }
    }
    
}
