/*
Pedir un numero entre 0 y 9999, y decir cuantas cifras tiene
 */
package condicionales_ejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
        
        if (numero < 10) {
            JOptionPane.showMessageDialog(null, "Tiene 1 Digito");
        }
        else if (numero >=10 && numero < 100 ) {
            JOptionPane.showMessageDialog(null, "Tiene 2 Digito");
        }
        else if (numero >=100 && numero < 1000 ) {
            JOptionPane.showMessageDialog(null, "Tiene 3 Digito");
        }
        else if (numero >=1000 && numero < 10000 ) {
            JOptionPane.showMessageDialog(null, "Tiene 4 Digito");
        }
        else if (numero >=10000 && numero < 100000 ) {
            JOptionPane.showMessageDialog(null, "Tiene 5 Digito");
        }
        else {
            JOptionPane.showMessageDialog(null, "Tiene mas de 5 Digitos");
        }
        }
//        JOptionPane.showMessageDialog(null, "La cantidad de digitos son: "+Integer.toString(numero).length());
    }
    

