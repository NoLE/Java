/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Visual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
    String cadena;
    int entero;
    char letra;
    double decimal;
    
    cadena = JOptionPane.showInputDialog("Dijite una Cadena: ");
    entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero entero: ")); //Integer.parseInt es para transformar una cadena en un entero
    letra = JOptionPane.showInputDialog("Digite un Caracter: ").charAt(0);
    decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: "));
    
    JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
    JOptionPane.showMessageDialog(null, entero);
    JOptionPane.showMessageDialog(null, letra);
    JOptionPane.showMessageDialog(null, decimal);
    
    }
    
}
