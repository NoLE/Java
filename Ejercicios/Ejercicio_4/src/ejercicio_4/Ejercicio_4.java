/*
UNA COMPAÑIA DE VENTAS DE CARRO USADOS, PAGA A SU PERSONAL DE VENTAS UN SALARIO DE $1000
MENSUALES, MAS UNA COMICION DE $150 POR CADA CARRO VENDIDO
MAS EL 5% DEL VALOR DE LA VENTA POR CARRO
CADA MES EL CAPTURISTA DE LA EMPRESA INGRESA LOS DATOS CORRESPONDIENTES A LA COMPUTADORA

HACER UN PROGRAMA, QUE CALCULE EL SALARIO MENSUAL DE UN VENDENDOR DADO
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author ActiveWeb
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float sbase = 1000, comision, avendidos, vventas, tmes;
        System.out.println("Ingrese cantidad de autos vendidos: ");
        avendidos = entrada.nextFloat();
        System.out.println("Ingrese el valor total por las ventas: ");
        vventas = entrada.nextFloat();
        
        comision = (avendidos * 150)+(vventas*0.05f);
        tmes = comision + sbase;
        System.out.println("El salario total es: "+tmes+" "+comision);
        
    }
    
}
