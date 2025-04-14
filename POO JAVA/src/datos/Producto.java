package datos;

public class Producto {
    public String codigo;
    public String nombre;
    public int cantidad;
    public double precio;
    public double subtotal;
    public double igv;
    public double total;

    //Primero calculamos la cantidad de productos por el precio
    public double calcular(){
        subtotal = cantidad * precio;
        return subtotal;
    }
    //Luego calculamos el igv segun la precio multiplicando por el 18% que vale el igv
    public double calcular(double subtotal){
        igv = subtotal * 0.18;
        return igv;
    }
    //En esta parte calculamos el total multiplicando el subtotal por ivg sacado del mismo
    public double calcular(double subtotal, double igv){
        total = subtotal +  igv;
        return total;
    }
}
