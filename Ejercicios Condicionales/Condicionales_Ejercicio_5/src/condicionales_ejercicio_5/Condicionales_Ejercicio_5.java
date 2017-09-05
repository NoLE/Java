/*
Un Obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos, el valor hora es de 16
Si trabaja mas de 40 horas. se le pagara 16 por cada una de las priemras 40 horas y 20 por cada hora extra
 */
package condicionales_ejercicio_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Condicionales_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salariosemanal, vhora=16, vhoraextra=20, choras, maxvalorsinextra;
        
        choras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Horas: "));
        
            if (choras<= 40) {
                salariosemanal = vhora * choras;
               JOptionPane.showMessageDialog(null, "Su salario mensual, no tiene horas extras y es: "+salariosemanal);

            } else {
                maxvalorsinextra = vhora * 40;
                salariosemanal = (maxvalorsinextra + ( (choras - 40) * vhoraextra));
                JOptionPane.showMessageDialog(null, "El salario semanal con horas extras es: "+salariosemanal);
            }
          }
}
    

