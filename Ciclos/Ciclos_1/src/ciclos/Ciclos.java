/*
Leer un numero, e indicar si es posito o negativo, el proceso se repetira hasta que aparezca un 0
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while ( numero != 0) {            
            if ( numero > 0) {
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es positivo");
                
            } else {
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es negativo");
            }
            numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
    }
    
}
