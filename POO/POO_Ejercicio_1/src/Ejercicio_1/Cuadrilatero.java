 /*
Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la logintud de sus dos lados. 
Los valores de la logitud deberan introducirse por linea de ordes. 
si es un cuadrado, solo se proporcionara la logitud de uno de los lados al constructor.
 */
package Ejercicio_1;

/**
 *
 * @author ActiveWeb
 */
public class Cuadrilatero {
    private float lado1;
    private float lado2;
    
//    metodo constructor 1 este metodo nos ayudara siempre y cuando sea un cuadrilatero

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
//    metodo constructor 2 este metodo solo funcionara cuando sea cuadrado
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
    
    
}
