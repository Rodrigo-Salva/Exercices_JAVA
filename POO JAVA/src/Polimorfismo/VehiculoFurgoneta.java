package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    protected int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //metodos

    public void mostrarDatos(){
        System.out.println("La cantidad de carga que llega a carga es de: "+ getCarga());
    }
}
