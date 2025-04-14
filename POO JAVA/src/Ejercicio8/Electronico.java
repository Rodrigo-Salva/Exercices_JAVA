package Ejercicio8;

public class Electronico extends Producto {
    protected String marca;

    //constructor
    public Electronico(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Marca: "+ marca);
    }
}
