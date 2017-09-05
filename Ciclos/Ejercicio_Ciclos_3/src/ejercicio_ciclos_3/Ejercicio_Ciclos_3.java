/*
Pedir numero hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
 */
package ejercicio_ciclos_3;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero, suma = 0;
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while ( numero != 0) {            
            suma = numero + suma;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
    JOptionPane.showMessageDialog(null, "La suma total es: "+suma);
    }
}