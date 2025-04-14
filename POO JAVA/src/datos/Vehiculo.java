package datos;

public class Vehiculo {
    private String numeroPlaca;
    private String marca;
    private int cantidad;
    private double precio;
    private double subtotal;
    private double igv;
    private double total;

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodos
    public double calcularSubtotal(){
        subtotal = cantidad * precio;
        return subtotal;
    }
    public double calcularIGV(){
        igv = subtotal * 0.18;
        return igv;
    }
    public double calcularTotal(){
        total = subtotal + igv;
        return total;
    }
}
