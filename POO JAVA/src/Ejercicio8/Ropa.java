package Ejercicio8;

public class Ropa extends Producto{
    protected String talla;

    //constructores
    public Ropa(String nombre, double precio, int stock, String talla) {
        super(nombre, precio, stock);
        this.talla = talla;
    }

    //Get and set
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("talla: "+ talla);
    }
} 
