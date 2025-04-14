package Ejercicio8;

public class Prin_p {
    public static void main(String[] args) {
        Producto producto[] = new Producto[2];

        producto[0] = new Electronico("Carrito", 15, 2, "Mark");
        producto[1] = new Ropa("Polera", 25, 3, "M");

        for (int i = 0; i < producto.length; i++) {
            System.out.println("-----------------------------");
            producto[i].mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }
}
