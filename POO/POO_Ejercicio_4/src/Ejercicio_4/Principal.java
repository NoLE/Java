/*
Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas
caracterizados por su núnero de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos
de atleta ganador de la carrera
 */
package Ejercicio_4;

import java.util.Scanner;

public class Principal {
    public static int IndiceCorredorGanador(Atleta deportista[]){
        float tiempo_carrera;
        int indice = 0;
        tiempo_carrera = deportista[0].getTiempo_carrera();
        for (int i = 1; i < deportista.length; i++) {
            if (tiempo_carrera > deportista[i].getTiempo_carrera()) {
                tiempo_carrera = deportista[i].getTiempo_carrera();
                indice = i;
            }
        }
        return indice;
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num_atleta, cantidad_atletas, indiceGanador;
        String nombre;
        float tiempo_carrera;
        
        System.out.print("Digite cantidad de Atletas: ");
        cantidad_atletas = entrada.nextInt();
        Atleta deportista[] = new Atleta[cantidad_atletas];
        for (int i = 0; i < cantidad_atletas; i++) {
            System.out.println("Ingrese atleta numero "+(i+1)+": ");
            System.out.print("Ingrese numero de atleta: ");
            num_atleta = entrada.nextInt();
            System.out.print("Ingrese nombre del Atleta: ");
            entrada.nextLine();
            nombre = entrada.nextLine();
            System.out.print("Ingrese tiempo de carrera: ");
            tiempo_carrera = entrada.nextFloat();
            
            deportista[i] = new Atleta(num_atleta, nombre, tiempo_carrera);
            
        }
        indiceGanador = IndiceCorredorGanador(deportista);
        System.out.println("\nEl indice del ganador es: ");
        System.out.println(deportista[indiceGanador].mostrarDatos());
    }
}
