package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    protected int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    //Getters and Setters

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    //Metodos


    @Override
    public void mostrarDatos() {
        System.out.println("La cilindrida: " + getCilindrada());
    }
}
