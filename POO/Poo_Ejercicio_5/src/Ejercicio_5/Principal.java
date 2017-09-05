/*
Diseñar un programa para trabajar con triangulos isosceles. Para ello defina los atributos necesarios que se requieren,
proporcione metodos de consulta, un metodo constructor e implemente metodos para calcular el perimetro y el area
de un triangulo, ademas implementar un metodo que a partir de un arreglo de triangulos devuelva el area del triangulo
de mayor superficie
 */
package Ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Principal {
    
    public static double mayorArea(Triangulo_Isoseles triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int num_triangulos;
        
        System.out.println("Digite el numero de triangulos: ");
        num_triangulos = entrada.nextInt();
        
        Triangulo_Isoseles triangulos[] = new Triangulo_Isoseles[num_triangulos];
        
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo "+(i+1)+": ");
            System.out.print("Introduzca la Base: ");
            base = entrada.nextDouble();
            System.out.print("Introduzca el Lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo_Isoseles(base, lado);
            
            System.out.println("El perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El Area es: "+triangulos[i].obtenerArea());
        }
        
        System.out.println("El Area del triangulo de mayor superficie es: "+mayorArea(triangulos));
        
        
    }
}
