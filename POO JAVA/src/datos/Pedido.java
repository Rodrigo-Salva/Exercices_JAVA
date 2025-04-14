package datos;

public class Pedido {
    public String codigo;
    public String producto;
    public int cantidad;
    public double precio;
    public double subtotal;
    public double IGV;
    public double total;

    public double calcular(){
        subtotal = precio * cantidad;
        return subtotal;
    }
    public double calcular(double subtotal){
        IGV = subtotal * 0.18;
        return IGV;
    }
    public double calcular(double subtotal, double IGV){
        total = subtotal + IGV;
        return total;
    }
}
