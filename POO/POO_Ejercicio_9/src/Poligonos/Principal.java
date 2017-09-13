
package Poligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //Llenar Poligono
        llenarPoligono();
        mostrarResultados();
      
    }
    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {            
            do {                
                System.out.println("Digite que poligono desea:");
                System.out.println("1. Triangualo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();              
            } while (opcion<1 || opcion>2);
            switch(opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            System.out.println("Desea introducir otro poligono? Digite (S/N): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta =='s' || respuesta == 'S' );
        
    }
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.print("Digite el Lado 1 del Triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el Lado 2 del Triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el Lado 3 del Triangulo: ");
        lado3 = entrada.nextDouble();
        
       Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
        
}
    public static void llenarRectangulo(){
         double lado1, lado2;
            System.out.println("Digite el Lado 1 del Triangulo");
            lado1 = entrada.nextDouble();
            System.out.println("Digite el Lado 2 del Triangulo");
            lado2 = entrada.nextDouble();
            
            Rectangulo rectangulo = new Rectangulo(lado1, lado2);
            poligono.add(rectangulo);
            
    }
    public static void mostrarResultados(){
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("El Area es: "+poli.area());
        }
    }
            
    }
