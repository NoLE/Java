/*
Hacer un programa que tome 2 numeros y decir si pares o impares
 */
package condicionales_ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, par, impar;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            if (num1 % 2 == 0 && num2 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Ambos son Pares");
            }
            if (num1 % 2 != 0 && num2 % 2 != 0) {
                JOptionPane.showMessageDialog(null, "Ambos son Impares");
            }
            if (num1 % 2 != num2 % 2 ) {
                    if (num1 % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Numero "+num1+" es par");
                    } else {
                        JOptionPane.showMessageDialog(null, "Numero "+num1+" es impar");
                    }
                    if (num2 % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Numero "+num2+" es par");
                     } else {
                        JOptionPane.showMessageDialog(null, "Numero "+num2+" es impar");
                     }
                }
            }
}
        
       