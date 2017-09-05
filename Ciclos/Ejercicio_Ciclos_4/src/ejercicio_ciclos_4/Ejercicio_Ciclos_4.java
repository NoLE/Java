/*
Pedir un numero N y mostrar todos los numeros del 1 al N
 */
package ejercicio_ciclos_4;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero: "));
        if (numero > 0) {
            for (int i = 1; numero > 0; i++) {
            numero--;
//            JOptionPane.showMessageDialog(null, i);
            System.out.println(i);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero desde 1 en adelante");
        }
    }
    
}
