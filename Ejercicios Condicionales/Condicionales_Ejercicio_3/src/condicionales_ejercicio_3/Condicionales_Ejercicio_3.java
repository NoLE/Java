/*
Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayurcula
 */
package condicionales_ejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una Letra: ").charAt(0);
        
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra Mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
    
}
