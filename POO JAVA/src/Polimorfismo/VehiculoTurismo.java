package Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    protected int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarDatos(){
        System.out.println("Numero de puestas es: "+ getNumeroPuertas());
    }
}

