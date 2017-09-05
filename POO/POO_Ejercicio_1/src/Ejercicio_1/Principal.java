/*
Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la logintud de sus dos lados. 
Los valores de la logitud deberan introducirse por linea de ordes. si es un cuadrado, 
solo se proporcionara la logitud de uno de los lados al constructor. 

 */
package Ejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Principal {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1, lado2;
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Dijite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Dijite el lado 2: "));
        
        if (lado1 == lado2) { //es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El Area es: "+c1.getArea());
    }
}
