/*
Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
 */
package ejercicio_ciclos_8;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, multiplicacion; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero <= 10 && numero > 0) {
            for (int i = 1; i <= 10; i++) {
                multiplicacion = numero * i;
//                JOptionPane.showMessageDialog(null, numero+" x "+i+" = "+multiplicacion);
                System.out.println(numero+" x "+i+" = "+multiplicacion);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero debe ser de 0 a 10");
        }
    }
    
}
