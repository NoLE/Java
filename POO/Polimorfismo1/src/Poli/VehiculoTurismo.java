
package Poli;

public class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+
                 "\nModelo: "+modelo+
                "\nMatricula: "+matricula+
                "\nPuertas: "+nPuertas;
        
    }
}
