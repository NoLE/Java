/*
Pedir una nota, y que refeje si es insuficiente, suficiente, bien, notable, sobresaliente.
 */
package condicionales_ejercicio_10;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota: "));
        if ( (nota >= 0) && (nota <= 10) ) {
            if (nota <= 5.9) {
                JOptionPane.showMessageDialog(null, "La nota "+nota+" es insuficiente");
            }
            else if ((nota >= 6) && (nwota <= 6.9) ) {
                JOptionPane.showMessageDialog(null, "La nota "+nota+" es suficiente");
            }
            else if ( (nota >= 7) && (nota <= 7.9) ) {
                JOptionPane.showMessageDialog(null, "La nota "+nota+" esta Bien");
            }
            else if ( (nota >= 8) && (nota <= 8.9) ) {
                JOptionPane.showMessageDialog(null, "La nota "+nota+" es Notable");
            }
            else if ( (nota >= 9) && (nota <= 10)) {
                JOptionPane.showMessageDialog(null, "La nota "+nota+" es Sobresaliente!!!");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "La nota debe ser de 1 a 10");
        }
        
    }
    
}
