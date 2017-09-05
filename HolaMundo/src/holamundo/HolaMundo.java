/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner; //Libreria para añadir funcion Scaner para pedir datos al cliente

/**
 *
 * @author hoot6
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     **/
    public static void main(String[] args) {
        // TODO code application logic here}
        System.out.println("Hola Mundo");
        System.out.println("Hola Java"); //esto es un comentario
        byte entero = 12;
        System.out.println("Numero entero = "+entero);
        //ESCRIBIR SOUT + TAB crea el System.out.println
        float decimal = 3.45f;
        System.out.println("Numero decimal = "+decimal); 
//        PEDIR DATOS
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt(); // nextfloat para float, los datos decimales se ingresan con coma en vez de punto
        /* next para string, pero solo la primera palabra, nextline para toda la frase
        para variables char y capturar una letra se necesita next().charAt(Numero de la letra, comienza desde 0)*/
        System.out.println("El numero es: "+numero);
    }
}
