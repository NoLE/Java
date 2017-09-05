/*
Pedir numeros hasta que se introdusca uno negativo. y mostrar cuantos numeros se han introducido
 */
package ejercicio_ciclos_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, contador;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        contador = 0;
        for (int i = 1; numero >= 0; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
            contador = i;
        }
        JOptionPane.showMessageDialog(null, "El numero "+numero+" es negativo, intentos: "+contador);
    }
    
}
