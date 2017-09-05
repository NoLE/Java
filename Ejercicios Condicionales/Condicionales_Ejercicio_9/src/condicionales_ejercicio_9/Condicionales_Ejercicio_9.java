/*
Pedir dia, mes y año de una fecha e indicar sin son correctas, suponiendo que el mes tiene 30 dias
 */
package condicionales_ejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, año;
       dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia: "));
       mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes: "));
       año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año: "));
       
        if ( (dia>=1) && (dia <=30)) {
            if ( (mes>= 1) && (mes <= 12) ) {
                if (año>=1) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año no es correcto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes es correcto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dia es Incorrecto");
        }
         /* if ( (dia >= 1) && (dia <= 30) && (mes >= 1) && (mes <= 12) && (año >= 1)) {
            JOptionPane.showMessageDialog(null, "La fecha es correcta");
        } else {
            JOptionPane.showMessageDialog(null, "La fecha no es correcta");
        }*/
    }
    
}
