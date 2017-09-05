/*
Pedir 10 numeros. Mostrar su suma y cuantos hay mayores de $1000
 */
package ejercicio_ciclos_7;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_Ciclos_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sueldo, sumaSueldo=0, cantidadSueldosMayores1000=0;
        for (int i = 0; i < 10; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un sueldo: "));
            if (sueldo > 1000) {
                cantidadSueldosMayores1000++;
            }
            sumaSueldo = sumaSueldo + sueldo;
        }
        JOptionPane.showMessageDialog(null, "Suma total de los sueldos: "+sumaSueldo+" Sueldo mayores a 1000: "
        +cantidadSueldosMayores1000);
    }
    
}
