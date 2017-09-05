/*
Pedir 3 numeros y ordenarlos de mayor a menos
 */
package condicionales_ejercicio_7;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1, n2, n3, primero, segundo, tercero;
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1: "));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2: "));
       n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 3 "));
       
        if ( (n1 > n2) && (n2 > n3) ) {
            JOptionPane.showMessageDialog(null, "el orden es: "+n1+" - "+n2+" - "+n3);
        }
        else if ( (n1>n3) && (n3 > n2) ) {
            JOptionPane.showMessageDialog(null, "el orden es: "+n1+" - "+n3+" - "+n2);
        }
        else if ( (n2 > n1) && (n1 > n3) ) {
            JOptionPane.showMessageDialog(null, "el orden es: "+n2+" - "+n1+" - "+n3);
        }
        else if ( (n2 > n3) && (n3 >n1)) {
            JOptionPane.showMessageDialog(null, "el orden es: "+n2+" - "+n3+" - "+n1);
        }
        else if ( (n3 > n1) && (n1 > n2) ) {
            JOptionPane.showMessageDialog(null, "el orden es: "+n3+" - "+n1+" - "+n2);
        }
        else  {
            JOptionPane.showMessageDialog(null, "el orden es: "+n3+" - "+n2+" - "+n1);
        }
       }
    }
