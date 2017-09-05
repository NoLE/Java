/*
Construir un programa que dada una serie de vehiculos caracterizados por su marca,
modelo y precio, imprima las propiedades del vehiculo mas barato.
Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo y crear
una clase que represente a cada uno de ellos.
*/
package Ejercicio_3;

public class Veiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Veiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    public String mostrarDatos(){
        return "La Marca es: "+marca+"\n El modelo es: "+modelo+"\nEl precio es: $"+precio+"\n";
    }
    
}
