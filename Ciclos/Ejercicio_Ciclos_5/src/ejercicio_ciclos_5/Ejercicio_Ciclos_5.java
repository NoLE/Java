/*
Pedir 10 numero y escribir la suma total
 */
package ejercicio_ciclos_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, suma=0;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
            suma = suma + numero;
        }
       JOptionPane.showMessageDialog(null, suma);
    }
    
}
