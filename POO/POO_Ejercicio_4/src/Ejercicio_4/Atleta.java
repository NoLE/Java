/*
Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas
caracterizados por su núnero de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos
de atleta ganador de la carrera
 */
package Ejercicio_4;
public class Atleta {
    private int num_atleta;
    private String nombre;
    private float tiempo_carrera;

    public Atleta(int num_atleta, String nombre, float tiempo_carrera) {
        this.num_atleta = num_atleta;
        this.nombre = nombre;
        this.tiempo_carrera = tiempo_carrera;
    }

    public float getTiempo_carrera() {
        return tiempo_carrera;
    }
    
    public String mostrarDatos(){
        return "El corredor ganador es: "+nombre+"\n Numero: "+num_atleta+"\nTiempo: "+tiempo_carrera;
    }
    
    
}
