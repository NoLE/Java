/*
Diseñar un programa para trabajar con triangulos isosceles. Para ello defina los atributos necesarios que se requieren,
proporcione metodos de consulta, un metodo constructor e implemente metodos para calcular el perimetro y el area
de un triangulo, ademas implementar un metodo que a partir de un arreglo de triangulos devuelva el area del triangulo
de mayor superficie
 */
package Ejercicio_5;

/**
 *
 * @author ActiveWeb
 */
public class Triangulo_Isoseles {
    private double base;
    private double lado;

    public Triangulo_Isoseles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    public double obtenerPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado) - (base*base)/4))/2;
        return area;
    }
}
