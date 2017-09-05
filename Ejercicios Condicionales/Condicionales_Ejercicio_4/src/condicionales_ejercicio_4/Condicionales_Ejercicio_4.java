/*
En una megaplaza, se hace un descuento del 20% 
 */
package condicionales_ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, descuento=20, total;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor de la compra: "));
        if (valor>=300) {
            total = (valor - ((valor * descuento)/100));
            JOptionPane.showMessageDialog(null, "El valor total es: "+total);
        } else {
            JOptionPane.showMessageDialog(null, "El valor final es: "+valor);
        }
    }
    
}
