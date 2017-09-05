package Ejercicio_3;

import java.util.Scanner;

public class Principal {
    public static int IndiceCocheMBarato(Veiculo coches[]){
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (precio > coches[i].getPrecio()) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        
        System.out.println("Digite cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        Veiculo coches[] = new Veiculo[numeroVehiculos];
        for (int i = 0; i < numeroVehiculos; i++) {
            System.out.println("Digite las caracteristicas del coche "+(i+1)+": ");
            System.out.print("Digite la marca: ");
            marca = entrada.nextLine();
            System.out.print("Digite el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Digite precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Veiculo(marca, modelo, precio);
            
        }
        indiceBarato = IndiceCocheMBarato(coches);
        System.out.println("\n El indice del coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
    
}
