/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author ActiveWeb
 */
public class Operacion {
    //Atributos
    int numero1, numero2;
    int suma;
    int resta;
    int division;
    int multiplicacion;
    
    // Metodos
    
    // Leer Numeros
    
    public void leerNumeros (){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2: "));
    }
    public void sumar(){
        suma = numero1 + numero2;
    }
    public void restar(){
        resta = numero1 - numero2;
    }
    public void dividir(){
        division = numero1 / numero2;
    }
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Division es: "+division);
        System.out.println("La multiplicacion es: "+multiplicacion);
    }
}
