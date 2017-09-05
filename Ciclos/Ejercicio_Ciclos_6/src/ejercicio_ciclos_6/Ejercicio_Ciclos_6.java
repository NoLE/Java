/*
Pedir un numero y calcular su factorial
 */
package ejercicio_ciclos_6;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, factorial=1;
        numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));
        while (numero > 0) {            
            factorial *= numero;
            numero--;
        }
        JOptionPane.showMessageDialog(null, factorial);
    }
}
